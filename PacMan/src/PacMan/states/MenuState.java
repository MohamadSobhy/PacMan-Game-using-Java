
package PacMan.states;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import PacMan.Handler;
import PacMan.gfx.Assets;


public class MenuState extends State{

    
    public MenuState(Handler handler)
    {
        super(handler);
    }
    
    @Override
    public void tick() {
        Rectangle startR = new Rectangle( handler.getGame().getCanvas().getWidth()/2 - 50 , handler.getGame().getCanvas().getHeight()/2 , 175 , 77 );
        Rectangle exitR = new Rectangle( handler.getGame().getCanvas().getWidth()/2 - 43 , handler.getGame().getCanvas().getHeight()/2 + 120 , 165 , 77 );
        
        if(handler.getMouseManager().isLeftPressed() && startR.contains(handler.getMouseManager().getMouseX(), handler.getMouseManager().getMouseY())){
            
            handler.getGame().setWorldNumber(1);
            handler.getGame().setScore(-handler.getGame().getScore());
            State.setCurrentState(new GameState(handler , 1));
            
        }
        
        if(handler.getMouseManager().isLeftPressed() && exitR.contains(handler.getMouseManager().getMouseX(), handler.getMouseManager().getMouseY())){
            System.exit(0);
        }
        
        
    }
//getRectangle().intersects(r)
    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.mainPic, 0, 0, handler.getGame().getWidth() , handler.getGame().getHeight() , null );
        g.drawImage(Assets.startButton, handler.getGame().getCanvas().getWidth()/2 - 50 , handler.getGame().getCanvas().getHeight()/2 , null);
        g.drawImage(Assets.exitButton, handler.getGame().getCanvas().getWidth()/2 - 43 , handler.getGame().getCanvas().getHeight()/2 +120 , null );
        
        if( handler.getWorld().getEntityManager().getPlayer().dead){
            g.setColor(Color.red);
            g.setFont(new Font("Sergiue", Font.BOLD, 50));
            g.drawString("You are Killed. Your Score : " + handler.getGame().getScore(), 200, 150);
        }
        
        if( handler.getWorld().getEntityManager().getPlayer().winner){
            g.setColor(Color.green);
            g.setFont(new Font("Sergiue", Font.BOLD, 40));
            g.drawString("Congratulations. You Won the Game -- Your Score : " + handler.getGame().getScore(), 130, 150);
        }
        
    }
    
    
}
