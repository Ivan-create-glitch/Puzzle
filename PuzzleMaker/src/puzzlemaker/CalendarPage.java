package puzzlemaker;

import java.awt.*;

public class CalendarPage {

    private final static int NUM_ROWS = 8;
    private final static int NUM_COLUMNS = 8;      
    
    //    static int ButtonLength = 75;
//    static int ButtonWidth = 180;
//    static int ButtonXPos = 210;
//    static int ButtonYPos = 255;
    
    public static void Reset() {
    }
    public static void Draw(Graphics2D g) {
        int ydelta = Window.getHeight2()/NUM_ROWS;
        int xdelta = Window.getWidth2()/NUM_COLUMNS;
       
//Draw the grid.        
        g.setColor(Color.black);
        for (int zi = 1;zi<NUM_ROWS;zi++)
        {
            g.drawLine(Window.getX(0),Window.getY(zi*ydelta),
                    Window.getX(Window.getWidth2()),Window.getY(zi*ydelta));
        }
       
        for (int zi = 1;zi<NUM_COLUMNS;zi++)
        {
            g.drawLine(Window.getX(zi*xdelta),Window.getY(0),
                    Window.getX(zi*xdelta),Window.getY(Window.getHeight2()));
        }
        
       
    
    }
}