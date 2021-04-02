package puzzlemaker;

import java.awt.*;

public class CalendarPage {
    
    private static int num_classes = 6;
    private final static int NUM_ROWS = num_classes+1;
    private final static int NUM_COLUMNS = 6;      
    private static int CalHeight = 450;
    private static int CalWidth = 450;
    //    static int ButtonLength = 75;
//    static int ButtonWidth = 180;
//    static int ButtonXPos = 210;
//    static int ButtonYPos = 255;
    
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
       
        for (int zi = 1;zi<=NUM_COLUMNS+1;zi++)
        {
            g.drawLine(Window.getX(zi*xdelta),Window.getY(ydelta),
                    Window.getX(zi*xdelta),Window.getY(CalHeight+ydelta));
        }
        
       
    
    }
}