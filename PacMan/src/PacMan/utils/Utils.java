
package PacMan.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Utils {
    
    public static String loadWorldAsString(String path)
    {
        StringBuilder builder = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line ;
            while((line = reader.readLine()) != null)
                builder.append(line + "\n");
            
            reader.close();
        } catch (IOException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return builder.toString();
    }
    
    public static int parseInt(String number)
    {
        try{
        return Integer.parseInt(number);
        }
        catch(NumberFormatException e)
        {
            e.printStackTrace();
            return 0;
        }
    }
    
}
