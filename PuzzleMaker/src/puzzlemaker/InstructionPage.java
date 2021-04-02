package puzzlemaker;

import java.awt.*;

public class InstructionPage {
    
    static int ButtonLength = 30;
    static int ButtonWidth = 80;
    static int ButtonXPos = 20;
    static int ButtonYPos = 20;
    public static void Reset() {
    }
    public static void Draw(Graphics2D g) {
        ////Instructions
         g.setColor(Color.white);
         g.setFont(new Font("Times New Roman",Font.PLAIN,30));  
         g.drawString("Instructions:",Window.getX(50),Window.getY(120));
         g.drawString("This application is used to organize your",Window.getX(50),Window.getY(180));
         g.drawString("assignments from classes efficiently and ",Window.getX(50),Window.getY(210));
         g.drawString("effectively. A student will log in all",Window.getX(50),Window.getY(240));
         g.drawString("assignments into a calender, complete",Window.getX(50),Window.getY(270));
         g.drawString("them, and earn points from doing so.",Window.getX(50),Window.getY(300));
         g.drawString("These points can be used to buy puzzle",Window.getX(50),Window.getY(330));
         g.drawString("pieces required to create different",Window.getX(50),Window.getY(360));
         g.drawString("puzzles. Once finished, the puzzle will",Window.getX(50),Window.getY(390));
         g.drawString("transform into the reward the student has",Window.getX(50),Window.getY(420));
         g.drawString("earned. Points are earned by logging in all",Window.getX(50),Window.getY(450));
         g.drawString("assignments (once point max per week) or",Window.getX(50),Window.getY(480));
         g.drawString("for the completion of every 3 assignments.",Window.getX(50),Window.getY(510));
         
         
         ////Back Button
         g.setFont(new Font("Arial",Font.PLAIN,20));
         g.setColor(Color.cyan);
         g.fillRect(Window.getX(ButtonXPos),Window.getY(ButtonYPos),ButtonWidth,ButtonLength);
         g.setColor(Color.black);
         g.drawString("Back",Window.getX(35),Window.getY(43));
    }
    
    }