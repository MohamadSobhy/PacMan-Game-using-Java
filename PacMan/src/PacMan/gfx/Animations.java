
package PacMan.gfx;

import java.awt.image.BufferedImage;

public class Animations {
    
    private BufferedImage frames;
    
    public Animations(BufferedImage frames)
    {
        this.frames = frames;
    }
    
    public void tick()
    {
       
    }
    public BufferedImage getCurrentFrame()
    {
        return frames;
    }
    
    
}
