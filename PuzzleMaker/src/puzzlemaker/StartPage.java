package puzzlemaker;

import java.awt.*;

public class StartPage {
    static int ButtonLength = 75;
    static int ButtonWidth = 180;
    static int ButtonXPos = 235;
    static int ButtonYPos = 300;
    public static void Reset() {
    }
    public static void Draw(Graphics2D g) {
         g.setColor(Color.black);
         g.setFont(new Font("Arial",Font.PLAIN,50));  
         g.drawString("Puzzle Mania!",175,150);
         g.setFont(new Font("Arial",Font.PLAIN,30));
         g.setColor(Color.green);
         g.fillRect(ButtonXPos,ButtonYPos,ButtonWidth,ButtonLength);
         g.setColor(Color.black);
         g.drawString("Start Game",250,350);
    }
    
    }