
package PacMan.entities.statics;

import java.awt.Graphics;
import PacMan.Handler;
import PacMan.gfx.Assets;
import PacMan.tiles.Tile;

public class Food extends StaticEntities{

    public Food(Handler handler, float x, float y) {
        super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT );
        
        bounds.x = 10;
        bounds.y = (int) ( height / 1.5f );
        bounds.width = width - 20;
        bounds.height = (int) ( height - height / 1.5f);
    }

    @Override
    public void tick() {
        
    }
    
   @Override
    public void die() {
        
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.food, (int) ( x - handler.getGameCamera().getxOffset() ), (int)  ( y - handler.getGameCamera().getyOffset() ), width , height , null);
    }
    
}
