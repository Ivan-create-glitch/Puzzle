/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puzzlemaker;

import java.awt.Graphics2D;
import java.awt.*;

public class PuzzleWorkshopPage {
     static int ButtonLength = 30;
    static int ButtonWidth = 80;
    static int ButtonXPos = 20;
    static int ButtonYPos = 20;
    private final static int NUM_ROWS = 7;
    private final static int NUM_COLUMNS = 6;      
    private static int CalHeight = 450;
    private static int CalWidth = 450;
    static int numPieces1 = 9;
     int BuyLength = 30;
     int BuyWidth = 40;
     int BuyXPos;
     int BuyYPos;
     
     static int piece1Xpos=120;
     static int piece1Ypos=0;
     static int piece2Xpos=400;
     static int piece2Ypos=-30;
     static int piece3Xpos=500;
     static int piece3Ypos=-60;
     static int piece4Xpos=200;
     static int piece4Ypos=0;
     static int piece5Xpos=275;
     static int piece5Ypos=-50;
     static double x = 0.25;
     static double x2 = 0.25;
     static double x3 = 0.25;
     static double x4 = 0.25;
     static double x5 = 0.25;
     

    public static void Reset() {
    }
    public static void Draw(Graphics2D g) {
         ////Back Button
         g.setFont(new Font("Arial",Font.PLAIN,20));
         g.setColor(Color.cyan);
         g.fillRect(Window.getX(ButtonXPos),Window.getY(ButtonYPos),ButtonWidth,ButtonLength);
         g.setColor(Color.black);
         g.drawString("Back",Window.getX(35),Window.getY(43));
         
         
          int ydelta = CalHeight/NUM_ROWS;
        int xdelta = CalWidth/NUM_COLUMNS;
         
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
        
        //constructs whole puzzle at corrdinates (75,65)
        
       
        if(PuzzleShopPage.retBought1())
        piece1(Window.getX(piece1Xpos),Window.getY(piece1Ypos),0,x,x,g);
        if(PuzzleShopPage.retBought2())
         piece2(Window.getX(piece2Xpos),Window.getY(piece2Ypos),0,x2,x2,g);
        if(PuzzleShopPage.retBought3())
         piece3(Window.getX(piece3Xpos),Window.getY(piece3Ypos),0,x3,x3,g);
        if(PuzzleShopPage.retBought4())
         piece4(Window.getX(piece4Xpos),Window.getY(piece4Ypos),0,x4,x4,g);
        if(PuzzleShopPage.retBought5())
         piece5(Window.getX(piece5Xpos),Window.getY(piece5Ypos),0,x5,x5,g);
         
    }
    
     public static void piece1(int xpos,int ypos,double rot,double xscale,double yscale, Graphics2D g)
    {
        int ydelta = CalHeight/NUM_ROWS;
        int xdelta = CalWidth/NUM_COLUMNS;
        
        g.translate(xpos,ypos);
        g.rotate(rot  * Math.PI/180.0);
        g.scale( xscale , yscale );

        g.setColor(Color.black);
        int xval[] = {0,xdelta*3,xdelta*3,0,0};
        int yval[] = {0,0,ydelta*4,ydelta*2,0};
        g.fillPolygon(xval,yval,xval.length);
        
        
        g.scale( 1.0/xscale,1.0/yscale );
        g.rotate(-rot  * Math.PI/180.0);
        g.translate(-xpos,-ypos);
    }
      public static void piece2(int xpos,int ypos,double rot,double xscale,double yscale, Graphics2D g)
    {
        int ydelta = CalHeight/NUM_ROWS;
        int xdelta = CalWidth/NUM_COLUMNS;
        
        g.translate(xpos,ypos);
        g.rotate(rot  * Math.PI/180.0);
        g.scale( xscale , yscale );

        g.setColor(Color.black);
        int xval[] = {0,xdelta*3,0,0};
        int yval[] = {ydelta*2,ydelta*4,ydelta*6,ydelta*2};
        g.fillPolygon(xval,yval,xval.length);
        
        
        g.scale( 1.0/xscale,1.0/yscale );
        g.rotate(-rot  * Math.PI/180.0);
        g.translate(-xpos,-ypos);
    }
       public static void piece3(int xpos,int ypos,double rot,double xscale,double yscale, Graphics2D g)
    {
        int ydelta = CalHeight/NUM_ROWS;
        int xdelta = CalWidth/NUM_COLUMNS;
        
        g.translate(xpos,ypos);
        g.rotate(rot  * Math.PI/180.0);
        g.scale( xscale , yscale );

        g.setColor(Color.black);
        int xval[] = {0,xdelta*3,xdelta*4,xdelta*4,0,0};
        int yval[] = {ydelta*6,ydelta*4,ydelta*4,ydelta*7,ydelta*7,ydelta*6};
        g.fillPolygon(xval,yval,xval.length);
        
        
        g.scale( 1.0/xscale,1.0/yscale );
        g.rotate(-rot  * Math.PI/180.0);
        g.translate(-xpos,-ypos);
    }
        public static void piece4(int xpos,int ypos,double rot,double xscale,double yscale, Graphics2D g)
    {
        int ydelta = CalHeight/NUM_ROWS;
        int xdelta = CalWidth/NUM_COLUMNS;
        
        g.translate(xpos,ypos);
        g.rotate(rot  * Math.PI/180.0);
        g.scale( xscale , yscale );

        g.setColor(Color.black);
        int xval[] = {xdelta*3,xdelta*6,xdelta*6,xdelta*4,xdelta*4,xdelta*3,xdelta*3};
        int yval[] = {0,0,ydelta*3,ydelta*3,ydelta*4,ydelta*4,0};
        g.fillPolygon(xval,yval,xval.length);
        
        
        g.scale( 1.0/xscale,1.0/yscale );
        g.rotate(-rot  * Math.PI/180.0);
        g.translate(-xpos,-ypos);
    }
         public static void piece5(int xpos,int ypos,double rot,double xscale,double yscale, Graphics2D g)
    {
        int ydelta = CalHeight/NUM_ROWS;
        int xdelta = CalWidth/NUM_COLUMNS;
        
        g.translate(xpos,ypos);
        g.rotate(rot  * Math.PI/180.0);
        g.scale( xscale , yscale );

        g.setColor(Color.black);
        int xval[] = {xdelta*4,xdelta*6,xdelta*6,xdelta*4,xdelta*4};
        int yval[] = {ydelta*3,ydelta*3,ydelta*7,ydelta*7,ydelta*3};
        g.fillPolygon(xval,yval,xval.length);
        
        
        g.scale( 1.0/xscale,1.0/yscale );
        g.rotate(-rot  * Math.PI/180.0);
        g.translate(-xpos,-ypos);
    }
}
