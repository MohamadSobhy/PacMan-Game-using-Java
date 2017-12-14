
package PacMan.tiles;

import PacMan.gfx.Assets;

public class RockTile extends Tile{
    
    public RockTile(int id) {
        super(Assets.rock_middle, id);
        if( id == 3 )
            super.setTile(Assets.rock_right);
        else if( id == 4 )
            super.setTile(Assets.rock_left);
        else if( id == 5 )
            super.setTile(Assets.corner_right);
        else if( id == 6 )
            super.setTile(Assets.corner_left);
        else if( id == 7 )
            super.setTile(Assets.corner_right_up);
        else if( id == 8 )
            super.setTile(Assets.corner_left_up);
        else if( id == 9 )
            super.setTile(Assets.rock_middle_up);
        else if( id == 10 )
            super.setTile(Assets.rock_up);
        else if( id == 11 )
            super.setTile(Assets.rock_down);
        
    }
    
    @Override
    public boolean isSolid()
    {
        return true;
    }
    
}
