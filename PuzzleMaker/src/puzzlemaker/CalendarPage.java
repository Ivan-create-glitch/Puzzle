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
    static int ShopButtonXPos = 533;
    static int ShopButtonYPos = 20;
    static int ShopButtonWidth = 60;
    
    static int BuildButtonXPos = 533;
    static int BuildButtonYPos = 80;
    
    static int points = 0;
    
    public static void Reset() {
    }
    public static int ReturnHeight(){
        return(CalHeight);
    }
    public static int ReturnRows(){
        return(NUM_ROWS);
    }
    public static int ReturnColumns(){
        return(NUM_COLUMNS);
    }
    public static int ReturnWidth(){
        return(CalWidth);
    }
    public static int returnPoints(){
        return(points);
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
         g.drawString("Mon",Window.getX(2*xdelta+xdelta/4),Window.getY((int)(2*ydelta/1.25)));
         g.drawString("Tue",Window.getX(3*xdelta+xdelta/4),Window.getY((int)(2*ydelta/1.25)));
         g.drawString("Wed",Window.getX(4*xdelta+xdelta/4),Window.getY((int)(2*ydelta/1.25)));
         g.drawString("Thu",Window.getX(5*xdelta+xdelta/4),Window.getY((int)(2*ydelta/1.25)));
         g.drawString("Fri",Window.getX(6*xdelta+xdelta/4),Window.getY((int)(2*ydelta/1.25)));
         g.setFont(new Font("Arial",Font.PLAIN,10));
         g.drawString("Math",Window.getX(xdelta+xdelta/4),Window.getY((int)(3*ydelta/1.04)));
         g.drawString("English",Window.getX(xdelta+xdelta/4),Window.getY((int)(4*ydelta/1.04)));
         g.drawString("History",Window.getX(xdelta+xdelta/4),Window.getY((int)(5*ydelta/1.04)));
         g.drawString("PE",Window.getX(xdelta+xdelta/4),Window.getY((int)(6*ydelta/1.04)));
         g.drawString("Science",Window.getX(xdelta+xdelta/4),Window.getY((int)(7*ydelta/1.04)));
         g.drawString("Comp Science",Window.getX(xdelta),Window.getY((int)(8*ydelta/1.04)));
         
        for (int zi = 1;zi<=NUM_COLUMNS+1;zi++)
        {
            g.drawLine(Window.getX(zi*xdelta),Window.getY(ydelta),
                    Window.getX(zi*xdelta),Window.getY(CalHeight+ydelta));
            
        }
        
        
        points = Tasks.totPoints();
        
       
            
        // points display
        g.setFont(new Font("Arial",Font.PLAIN,20));
         g.setColor(Color.black);
         g.drawString("Points = " + points,Window.getWidth2()/2,Window.getY(43));
        
        
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