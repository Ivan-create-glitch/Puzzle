/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puzzlemaker;

import java.awt.Graphics2D;
import java.awt.*;

public class PuzzleShopPage {
     static int ButtonLength = 30;
    static int ButtonWidth = 80;
    static int ButtonXPos = 20;
    static int ButtonYPos = 20;
    
    static int numPieces1 = 9;
     int BuyLength = 30;
     int BuyWidth = 40;
     int BuyXPos = 20;
     int BuyYPos = 20;
     List buttons[];

    public static void Reset() {
    }
    public static void Draw(Graphics2D g) {
         ////Back Button
         g.setFont(new Font("Arial",Font.PLAIN,20));
         g.setColor(Color.cyan);
         g.fillRect(Window.getX(ButtonXPos),Window.getY(ButtonYPos),ButtonWidth,ButtonLength);
         g.setColor(Color.black);
         g.drawString("Back",Window.getX(35),Window.getY(43));
         
         
         
         
    }
    
}
