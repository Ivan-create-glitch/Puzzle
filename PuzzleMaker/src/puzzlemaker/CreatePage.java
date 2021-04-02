
package puzzlemaker;

import java.util.Scanner;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

public class CreatePage {
 
    static int ButtonLength = 70;
    static int ButtonWidth = 70;
    static int ButtonXPos = 0;
    static int ButtonYPos = 0;
    private static String Typed="";
    
    public static void Draw(Graphics2D g)
    {
        g.setColor(Color.white);
        g.fillRect(0, 0, Window.xsize, Window.ysize);
        
        g.setFont(new Font("Arial",Font.PLAIN,30));
         g.setColor(Color.red);
         g.fillRect(Window.getX(ButtonXPos),Window.getY(ButtonYPos),ButtonWidth,ButtonLength);
         g.setColor(Color.black);
         g.drawString("X",Window.getX(ButtonXPos+ButtonWidth/2),Window.getY(ButtonYPos+ButtonLength/2));
         

         
         g.drawString("Name of Task:",Window.WINDOW_WIDTH/3+30,Window.WINDOW_HEIGHT/4);
         g.drawString(Typed,Window.WINDOW_WIDTH/3+30,Window.WINDOW_HEIGHT/4+40);
         
         
    }
    
    
  
    
}
