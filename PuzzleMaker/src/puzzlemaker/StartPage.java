package puzzlemaker;

import java.awt.*;

public class StartPage {
    static int ButtonLength = 75;
    static int ButtonWidth = 180;
    static int ButtonXPos = 210;
    static int ButtonYPos = 255;
    static int InstructionsXPos = 223;
    static int InstructionsYPos = 400;
    static int underlineLength = 153;
    static int underlineYPos = 403;
    public static void Reset() {
    }
    public static void Draw(Graphics2D g) {
        ////Title
         g.setColor(Color.black);
         g.setFont(new Font("Arial",Font.PLAIN,50));  
         g.drawString("Puzzle Mania!",Window.getX(140),Window.getY(120));
         ////Button
         g.setFont(new Font("Arial",Font.PLAIN,30));
         g.setColor(Color.green);
         g.fillRect(Window.getX(ButtonXPos),Window.getY(ButtonYPos),ButtonWidth,ButtonLength);
         g.setColor(Color.black);
         g.drawString("Start Game",Window.getX(223),Window.getY(305));
         ////Instructions "link"
         g.drawString("Instructions",Window.getX(InstructionsXPos),Window.getY(InstructionsYPos));
         g.drawLine(Window.getX(InstructionsXPos),Window.getY(underlineYPos),
                    Window.getX(InstructionsXPos+underlineLength),Window.getY(underlineYPos));
    }
    
    }