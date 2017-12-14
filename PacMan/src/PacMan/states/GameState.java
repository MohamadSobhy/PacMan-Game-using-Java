
package PacMan.states;

import java.awt.Graphics;
import PacMan.Game;
import PacMan.Handler;
import PacMan.entities.creature.Player;
import PacMan.entities.statics.Food;
import PacMan.gfx.Assets;
import PacMan.tiles.Tile;
import PacMan.worlds.World;
import PacMan.worlds.WorldManager;

public class GameState extends State{
    
    private World world;
    private WorldManager worldManager;
    public GameState(Handler handler , int worldNumber)
    {
        super(handler);
        worldManager = new WorldManager(handler ,"src/res/worlds/" , worldNumber);
        
    }

    @Override
    public void tick() {
        worldManager.tick();
    }

    @Override
    public void render(Graphics g) {
        worldManager.render(g);
    }
    
    
    
}
