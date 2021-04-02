package puzzlemaker;

import java.awt.*;

public class InstructionPage {
    // static int ButtonLength = 75;
   
    public static void Reset() {
    }
    public static void Draw(Graphics2D g) {
        ////Instructions
         g.setColor(Color.black);
         g.setFont(new Font("Times New Roman",Font.PLAIN,20));  
         g.drawString("Puzzle Mania!",Window.getX(140),Window.getY(120));
        
    }
    
    }