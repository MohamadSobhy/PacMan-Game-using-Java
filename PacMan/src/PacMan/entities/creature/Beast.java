
package PacMan.entities.creature;

import java.awt.Graphics;
import PacMan.Handler;
import PacMan.entities.Entity;
import PacMan.gfx.Assets;
import PacMan.states.State;
import PacMan.tiles.Tile;
import java.awt.Rectangle;

public class Beast extends creature{

    private int speed = 3;
    public Beast(Handler handler, float x, float y) {
        super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
    }

    @Override
    public void die() {
        
    }

    @Override
    public void tick() {
        getInput();
        x += speed;
    }
    
    public void getInput()
    {
        
        if(speed > 0){
             int tx = (int) (x + speed + bounds.x + bounds.width) / Tile.TILEWIDTH;
             if(!collisionWithTile(tx, (int) (y + bounds.y )/Tile.TILEHEIGHT ) &&
                     !collisionWithTile(tx, (int) (y + bounds.y + bounds.height - 1 )/Tile.TILEHEIGHT )){
                 speed = speed;
             }
             else{
                 speed = -speed;
             }
         }else if (speed < 0){
             int tx = (int) (x + speed + bounds.x) / Tile.TILEWIDTH;
             if(!collisionWithTile(tx, (int) (y + bounds.y )/Tile.TILEHEIGHT ) &&
                     !collisionWithTile(tx, (int) (y + bounds.y + bounds.height - 1 )/Tile.TILEHEIGHT )){
                 speed = speed;
             }else{
                 speed = -speed;
             }
         }
        
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.beast,(int) ( x - handler.getGameCamera().getxOffset() ), (int)  ( y - handler.getGameCamera().getyOffset() ), width , height , null);
    }
    
        
        
    
}
