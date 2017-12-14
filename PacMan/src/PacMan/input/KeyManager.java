
package PacMan.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import PacMan.entities.creature.Player;
import PacMan.gfx.Animations;
import PacMan.gfx.Assets;
import PacMan.tiles.Tile;

public class KeyManager implements KeyListener{

    public boolean keys [];
    public boolean up , down , left , right;
    
    public KeyManager()
    {
        keys = new boolean [256];
    }
    
    public void tick()
    {
        up = keys[KeyEvent.VK_UP];
        down = keys[KeyEvent.VK_DOWN];
        left = keys[KeyEvent.VK_LEFT];
        right = keys[KeyEvent.VK_RIGHT];
    }
    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        keys[e.getKeyCode()] = true;
        
        if(e.isAltDown() && e.getKeyCode() == KeyEvent.VK_F4){
            System.exit(0);
        }
        
        System.out.println("Key Pressed.");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keys[e.getKeyCode()] = false;
        
        
        /*
        if(e.getKeyCode() == KeyEvent.VK_UP){
            keys[KeyEvent.VK_DOWN] = false;
            keys[KeyEvent.VK_RIGHT] = false;
            keys[KeyEvent.VK_LEFT] = false;
            
        }else if(e.getKeyCode() == KeyEvent.VK_DOWN){
            keys[KeyEvent.VK_UP] = false;
            keys[KeyEvent.VK_RIGHT] = false;
            keys[KeyEvent.VK_LEFT] = false;
            
        }else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            keys[KeyEvent.VK_DOWN] = false;
            keys[KeyEvent.VK_UP] = false;
            keys[KeyEvent.VK_LEFT] = false;
            
        }else if(e.getKeyCode() == KeyEvent.VK_LEFT){
            keys[KeyEvent.VK_DOWN] = false;
            keys[KeyEvent.VK_RIGHT] = false;
            keys[KeyEvent.VK_UP] = false;
        }
        */
        
            
        
        
        if( e.getKeyCode() == KeyEvent.VK_RIGHT)
            Player.currentAnimation = Assets.player_right;
        else if( e.getKeyCode() == KeyEvent.VK_LEFT)
            Player.currentAnimation = Assets.player_left;
        else if( e.getKeyCode() == KeyEvent.VK_UP)
            Player.currentAnimation = Assets.player_up;
        else if( e.getKeyCode() == KeyEvent.VK_DOWN)
            Player.currentAnimation = Assets.player_down;
        
        
    }
    
}
