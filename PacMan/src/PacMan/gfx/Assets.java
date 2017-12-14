
package PacMan.gfx;

import java.awt.image.BufferedImage;

public class Assets {
    
    private static final int width = 100 , height = 100;
    public static BufferedImage beast , background , rock_right , rock_left , rock_up , rock_down , corner_right , corner_left 
                              , corner_left_up , corner_right_up , rock_middle_up , rock_middle , food , mainPic , startButton , exitButton;
    
    public static BufferedImage player_down ;
    public static BufferedImage player_up ;
    public static BufferedImage player_right;
    public static BufferedImage player_left ;
    
    public static void init()
    {
        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/res/Photos/sheet.png"));
        
        //player ...
        
        player_down = sheet.crop(4 * width, 0, width, height);
        player_up = sheet.crop(6 * width, 0, width, height);
        player_right = sheet.crop(6 * width, width, width, height);
        player_left = sheet.crop(4 * width, width, width, height);

        //Rocks .. 
        
        
        rock_middle = sheet.crop(3 * width - 1, 0, width - 1, height - 2);
        rock_middle_up = sheet.crop(2 * width, 2 * height, width - 1, height - 2);
        rock_right = sheet.crop(2 * width, width, width - 2, height - 1);
        rock_left = sheet.crop(width + 1, width, width - 1, height - 1);
        rock_up = sheet.crop(0, 0, width - 1, height);
        rock_down = sheet.crop(3 * width, 2 * height, width - 2, height - 2);
        corner_left = sheet.crop(0, height, width, height - 1);
        corner_right = sheet.crop(3 * width, height, width - 1, height - 1);
        corner_right_up = sheet.crop(width, 2 * width, width, height - 2);
        corner_left_up = sheet.crop(0, 2 * width, width, height - 2);
        
        
        //food .. 
        
        food = sheet.crop( 400   , 2 * height  , width , height);
        
        
        //other Pictures ..
        
        beast = sheet.crop(width, 0, width, height - 1);
        background = sheet.crop(2 * width + 1, 0, width - 3, height - 1);
        mainPic = sheet.crop(0, 3 * height, 8 * width, 7 * height);
        startButton = sheet.crop(8 * width, 3 * height, 175, 77);
        exitButton = sheet.crop(8 * width + 175, 3 * height, 165, 77);
    }
    
}
