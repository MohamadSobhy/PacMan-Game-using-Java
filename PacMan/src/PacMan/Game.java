package PacMan;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import javax.swing.JOptionPane;
import PacMan.display.Display;
import PacMan.gfx.Assets;
import PacMan.gfx.GameCamera;
import PacMan.input.KeyManager;
import PacMan.input.MouseManager;
import PacMan.states.GameState;
import PacMan.states.MenuState;
import PacMan.states.State;

public class Game implements Runnable{
    
    private Display display;
    private Thread thread;
    private int width ,height;
    public String title;
    private boolean running = false;
    private BufferStrategy bs;
    private Graphics g;
    
    //worldNumber and Score
    private int worldNumber = 1;
    private int score;
    
    
    //States 
    public State gameState;
    public State menuState;
    
    //Input
    private KeyManager keyManager;
    MouseManager mouseManager;
    
    //Camera 
    GameCamera gameCamera;
    
    //Handler
    private Handler handler;
    public Game(String title , int width , int height)
    {
        this.width = width;
        this.height = height;
        this.title = title;
        keyManager = new KeyManager();
        mouseManager = new MouseManager();
    }
    
    private void initComponents()
    {
        display = new Display(title , width , height);
        display.getFrame().addKeyListener(keyManager);
        display.getFrame().addMouseListener(mouseManager);
        display.getFrame().addMouseMotionListener(mouseManager);
        display.getCanvas().addMouseListener(mouseManager);
        display.getCanvas().addMouseMotionListener(mouseManager);
        
        Assets.init();
        
        handler = new Handler(this);
        gameCamera = new GameCamera( handler , 0 , 0 );
        
        gameState = new GameState(handler , worldNumber);
        menuState = new MenuState(handler);
        State.setCurrentState(menuState);
    }
    public Canvas getCanvas(){
        return display.getCanvas();
    }
    private void tick()
    {
        keyManager.tick();
        if(State.getCurrentState() != null)
            State.getCurrentState().tick();
    }
    private void render()
    {
        bs = display.getCanvas().getBufferStrategy();
        if(bs == null)
        {
            display.getCanvas().createBufferStrategy(3);
            return;
        }
        g = bs.getDrawGraphics();
        
        //Clear Screen 
        g.clearRect(0,0, width, height);
        //Draw 
        
        if(State.getCurrentState() != null)
            State.getCurrentState().render(g);
        
        
        
        //End Draw 
        bs.show();
        g.dispose();
    }
    public void run()
    {
        initComponents();
        int fps = 60;  //frame per second 
        double timePerTick = 1000000000/fps;
        double delta = 0;
        long now ;
        long lastTime = System.nanoTime();
        
        while(running)
        {
            now = System.nanoTime();
            delta += (now-lastTime)/timePerTick;
            lastTime = now;
            
            if(delta >= 1){
            tick();
            render();
            delta--;
            }
            
        }
        stop();
    }

    public Graphics getG() {
        return g;
    }
    
    public KeyManager getKeyManager()
    {
        return keyManager;
    }

    public MouseManager getMouseManager() {
        return mouseManager;
    }
    

    public GameCamera getGameCamera() {
        return gameCamera;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    
    public int getWorldNumber(){
        return worldNumber;
    }
    public void setWorldNumber(int worldNumber){
        this.worldNumber = worldNumber;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = this.score + score;
    }
    
    public synchronized void start()
    {
        if(running)
            return;
        
        running = true;
        thread = new Thread(this);
        thread.start();
    }
    
    public synchronized void stop()
    {
        if(!running)
            return;
        
        running = false;
        try {
            thread.join();
        } catch (InterruptedException ex) {
            JOptionPane.showMessageDialog(null, ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
}
