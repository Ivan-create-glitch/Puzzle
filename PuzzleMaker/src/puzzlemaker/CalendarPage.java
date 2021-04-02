package puzzlemaker;

import java.awt.*;

public class CalendarPage {
    
    private static int num_classes = 6;
    private final static int NUM_ROWS = num_classes+1;
    private final static int NUM_COLUMNS = 6;      
    private static int CalHeight = 450;
    private static int CalWidth = 450;
    static int ButtonLength = 30;
    static int ButtonWidth = 80;
    static int ButtonXPos = 20;
    static int ButtonYPos = 20;
    static boolean active = true;
 
    static int ShopButtonXPos = 533;
    static int ShopButtonYPos = 20;
    static int ShopButtonWidth = 60;
    
    static int BuildButtonXPos = 533;
    static int BuildButtonYPos = 80;
    
    public static void Reset() {
    }
    public static void Draw(Graphics2D g) {
        int ydelta = CalHeight/NUM_ROWS;
        int xdelta = CalWidth/NUM_COLUMNS;
       
//Draw the grid.        
        g.setColor(Color.black);
        for (int zi = 1;zi<=NUM_ROWS+1;zi++)
        {
            g.drawLine(Window.getX(xdelta),Window.getY(zi*ydelta),
                    Window.getX(CalWidth+xdelta),Window.getY(zi*ydelta));
            
            
        }
        g.setFont(new Font("Arial",Font.PLAIN,20));
        g.setColor(Color.black);
         g.drawString("Mon",Window.getX(2*xdelta),Window.getY((int)(2*ydelta/1.25)));
         g.drawString("Tue",Window.getX(3*xdelta),Window.getY((int)(2*ydelta/1.25)));
         g.drawString("Wed",Window.getX(4*xdelta),Window.getY((int)(2*ydelta/1.25)));
         g.drawString("Thu",Window.getX(5*xdelta),Window.getY((int)(2*ydelta/1.25)));
         g.drawString("Fri",Window.getX(6*xdelta),Window.getY((int)(2*ydelta/1.25)));
         
        for (int zi = 1;zi<=NUM_COLUMNS+1;zi++)
        {
            g.drawLine(Window.getX(zi*xdelta),Window.getY(ydelta),
                    Window.getX(zi*xdelta),Window.getY(CalHeight+ydelta));
            
        }
        
       ////Back Button
         g.setFont(new Font("Arial",Font.PLAIN,20));
         g.setColor(Color.cyan);
         g.fillRect(Window.getX(ButtonXPos),Window.getY(ButtonYPos),ButtonWidth,ButtonLength);
         g.setColor(Color.black);
         g.drawString("Back",Window.getX(35),Window.getY(43));
         
         ////Shop Button
         g.setFont(new Font("Arial",Font.PLAIN,20));
         Color color1 = new Color(238,123,36);
         g.setColor(color1);
         g.fillRect(Window.getX(ShopButtonXPos),Window.getY(ShopButtonYPos),ShopButtonWidth,ButtonLength);
         g.setColor(Color.black);
         g.drawString("Shop",Window.getX(540),Window.getY(43));
         
         ////PuzzleBuilder Button
         g.setFont(new Font("Arial",Font.PLAIN,20));
         Color color2 = new Color(24,143,255);
         g.setColor(color2);
         g.fillRect(Window.getX(BuildButtonXPos),Window.getY(BuildButtonYPos),ShopButtonWidth,ButtonLength);
         g.setColor(Color.black);
         g.drawString("Build",Window.getX(540),Window.getY(100));
    
    }
}