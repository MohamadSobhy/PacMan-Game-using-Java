
package PacMan.entities.creature;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import PacMan.Handler;
import PacMan.entities.Entity;
import PacMan.entities.statics.Food;
import PacMan.gfx.Animations;
import PacMan.gfx.Assets;
import PacMan.states.GameState;
import PacMan.states.State;
import PacMan.worlds.WorldManager;
import java.awt.event.KeyEvent;

public class Player extends creature{

    public static BufferedImage currentAnimation;
    Animations  animDown , animUp , animRight , animLeft ,animEat;
    private GameState gameState;
    
    public Player(Handler handler , float x, float y) {
        super(handler , x , y , (int) creature.DEFAULT_CREATURE_WIDTH , (int) creature.DEFAULT_CREATURE_HEIGHT);
        
        currentAnimation = Assets.player_right;
        
        
        bounds.x = 4;
        bounds.y = 4;
        bounds.width = 55;
        bounds.height = 55;
        
        animEat = new Animations(currentAnimation);
        animDown = new Animations(Assets.player_down);
        animUp = new Animations(Assets.player_up);
        animRight = new Animations(Assets.player_right);
        animLeft = new Animations(Assets.player_left);
    }

    @Override
    public void tick() {
        
        if(worldNumber == 2){
            gameState.tick();
            worldNumber = 3;
            return;
        }
        
        //Animations 
        animDown.tick();
        animUp.tick();
        animRight.tick();
        animLeft.tick();
        
        //Movement
        getInput();
        move();
        handler.getGameCamera().centerOnEntity(this);
        
        checkAttacks();
        checkScore();
    }
    
    public void getInput()
    {
        xMove = 0;
        yMove = 0;
        
        if(handler.getKeyManager().up)
            yMove = -speed;
        if(handler.getKeyManager().down)
            yMove = speed;
        if(handler.getKeyManager().left)
            xMove = -speed;
        if(handler.getKeyManager().right)
            xMove = speed;
        if(handler.getKeyManager().keys[KeyEvent.VK_ESCAPE]){
            dead = true;
            State.setCurrentState(handler.getGame().menuState);
        }
        
    }
    
    
    @Override
    public void render(Graphics g) {
        
        if(worldNumber == 2){
            gameState.render(g);
            worldNumber = 3;
            return;
        }
        
        g.drawImage( getCurrentAnimationFrame(), (int) ( x - handler.getGameCamera().getxOffset() ) 
                ,(int) ( y - handler.getGameCamera().getyOffset() ) , width , height , null);
        
        //g.drawRect((int)( x + bounds.x  ) , (int) ( y + bounds.y ) , bounds.width , bounds.height);
        
        g.setFont(new Font("Sergiue", Font.BOLD, 22));
        g.drawString("Score : " + handler.getGame().getScore() , handler.getGame().getCanvas().getWidth() - 150 , 50 );
        
    }
    private BufferedImage getCurrentAnimationFrame()
    {
        if(xMove > 0)
            return animRight.getCurrentFrame();
        else if(xMove < 0)
            return animLeft.getCurrentFrame();
        else if(yMove < 0)
            return animUp.getCurrentFrame();
        else if(yMove > 0)
            return animDown.getCurrentFrame();
        else
            return currentAnimation;
    }
    
    public int getBoundsHeight(){
        return bounds.height;
    }
    public int getBoundsWidth(){
        return bounds.width;
    }
    
    
    public int worldNumber;
    
    public void checkAttacks() {
        
        Rectangle cb = getCollisionBounds(0, 0);   
        Rectangle ar = new Rectangle();    
        int arSize = 30;             
        ar.width = arSize;                          
        ar.height = arSize;     

        if (handler.getKeyManager().up) {                  
            ar.x = cb.x + cb.width / 2 - arSize / 2; 
            ar.y = cb.y - arSize /2  + 30; 
        } else if (handler.getKeyManager().down) {            
            ar.x = cb.x + cb.width / 2 - arSize / 2;
            ar.y = cb.y + cb.height - 40;
        } else if (handler.getKeyManager().left) {
            ar.x = cb.x - arSize + 60;
            ar.y = cb.y + cb.height / 2 - arSize / 2 + 20;
        } else if (handler.getKeyManager().right) {
            ar.x = cb.x + cb.width - 40;
            ar.y = cb.y + cb.height / 2 - arSize / 2 + 20;
        }
        else{
            ar.x = cb.x - arSize + 40;
            ar.y = cb.y + cb.height / 2 - arSize / 2;
        }

        
        for (Entity e : handler.getWorld().getEntityManager().getEntities()) {
            if (e.equals(this)) {
                continue;
            }
            if (e.getCollisionBounds( 0 , 0).intersects(ar)) {
                if(e instanceof Beast || e instanceof BeastUp){
                    this.eat(10);
                    die();
                    State.setCurrentState(handler.getGame().menuState);
                    handler.getGame().getG().drawString("You are Killed. Your Score : " + handler.getGame().getScore(), 200, 400);
                    return;
                }
                e.eat(10);
                handler.getGame().setScore(10);
                return;
            }

        }   
    }
    
    
    public boolean winner;
    private void checkScore(){
        
        int count = 0;
        for(Entity e : handler.getWorld().getEntityManager().getEntities()){
            if(e instanceof Food)
                count++;
        }
        
        if(count == 0){
            worldNumber = handler.getGame().getWorldNumber();
            
            if(worldNumber == 1){
                handler.getGame().setWorldNumber(2);
                worldNumber = 2;
                
                gameState = new GameState(handler , worldNumber);
                State.setCurrentState(gameState);
                
            }else{
            winner = true;
            handler.getGame().setWorldNumber(1);
            State.setCurrentState(handler.getGame().menuState);
            }
        }
    }
    
    
    public boolean dead = false;

    BufferStrategy br;
    @Override
    public void die() {
        dead = true;
    }
    
    
}
