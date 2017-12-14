
package PacMan.tiles;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Tile {
    
    public static Tile [] tiles = new Tile[256];
    public static Tile backgroundTile = new BackgroundTile(0);
//    public static Tile foodTile = new foodTile(1);
    public static Tile rockMiddleTile = new RockTile(2);
    public static Tile rockMiddleUpTile = new RockTile(9);
    public static Tile rockRightTile = new RockTile(3);
    public static Tile rockLeftTile = new RockTile(4);
    public static Tile rockUpTile = new RockTile(10);
    public static Tile rockDownTile = new RockTile(11);
    public static Tile cornerRightTile = new RockTile(5);
    public static Tile cornerLeftTile = new RockTile(6);
    public static Tile cornerRighUptTile = new RockTile(7);
    public static Tile cornerLeftUpTile = new RockTile(8);
    
    
    public static final int TILEWIDTH = 64 , TILEHEIGHT = 64;
    
    protected BufferedImage image;
    protected final int id;
    
    public Tile(BufferedImage image , int id )
    {
        this.id = id;
        this.image = image;
        tiles[id] = this;
    }
    public void setTile(BufferedImage image){
        this.image = image;
    }
    public void tick()
    {
        
    }
    public void render(Graphics g , int x , int y)
    {
        g.drawImage(image,x,y,TILEWIDTH ,TILEHEIGHT ,null);
    }
    public boolean isSolid()
    {
        return false;
    }
    public int getId()
    {
        return this.id;
    }
    
}
