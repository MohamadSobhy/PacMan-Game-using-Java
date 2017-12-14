
package PacMan.display;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Display {
    
    private JFrame frame;
    private Canvas canvas;
    private String title;
    private int width,height;
    
    public Display(String title,int width,int height)
    {
        this.title = title;
        this.width = width;
        this.height = height;
        createDisplay();
    }
    public Canvas getCanvas()
    {
        return canvas;
    }
    
    public JFrame getFrame()
    {
        return frame;
    }
    
    public void createDisplay()
    {
        frame = new JFrame(title);
        frame.setSize(width, height);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        
        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(width,height));
        canvas.setMaximumSize(new Dimension(width,height));
        canvas.setMinimumSize(new Dimension(width,height));
        canvas.setFocusable(false);
        canvas.setBackground(Color.BLACK);
        canvas.setForeground(Color.green);
        frame.add(canvas);
        
        frame.setUndecorated(true);
        frame.setVisible(true);
    }
}
