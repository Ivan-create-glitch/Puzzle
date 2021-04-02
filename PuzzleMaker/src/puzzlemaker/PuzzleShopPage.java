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
    static int BuyLength = 30;
    static int BuyWidth = 40;
    static boolean bought1 = false;
    static int BuyXPos = 140;
    static int BuyYPos = 250;
    static boolean bought2 = false;
    static int BuyXPos2 = 470;
    static int BuyYPos2 = 250;
    static boolean bought3 = false;
    static int BuyXPos3 = 450;
    static int BuyYPos3 = 500;
    static boolean bought4 = false;
    static int BuyXPos4 = 200;
    static int BuyYPos4 = 510;
    static boolean bought5 = false;
    static int BuyXPos5 = 320;
    static int BuyYPos5 = 320;
     
private final static int NUM_ROWS = 7;
    private final static int NUM_COLUMNS = 6;      
    private static int CalHeight = 450;
    private static int CalWidth = 450;
    
    public static void Reset() {
    }
    public static boolean retBought1(){
        return(bought1);
    }
    public static boolean retBought2(){
        return(bought2);
    }
    public static boolean retBought3(){
        return(bought3);
    }
    public static boolean retBought4(){
        return(bought4);
    }
    public static boolean retBought5(){
        return(bought5);
    }
    public static void Draw(Graphics2D g) {
         ////Back Button
         g.setFont(new Font("Arial",Font.PLAIN,20));
         g.setColor(Color.cyan);
         g.fillRect(Window.getX(ButtonXPos),Window.getY(ButtonYPos),ButtonWidth,ButtonLength);
         g.setColor(Color.black);
         g.drawString("Back",Window.getX(35),Window.getY(43));
         if(bought1 == false)
         piece1(Window.getX(100),Window.getY(100),0,0.5,0.5,g);
         if(bought2 == false)
         piece2(Window.getX(450),Window.getY(50),0,0.5,0.5,g);
         if(bought3 == false)
         piece3(Window.getX(375),Window.getY(250),0,0.5,0.5,g);
         if(bought4 == false)
         piece4(Window.getX(50),Window.getY(370),0,0.5,0.5,g);
         if(bought5 == false)
         piece5(Window.getX(150),Window.getY(70),0,0.5,0.5,g);
         
         g.setFont(new Font("Arial",Font.PLAIN,20));
         g.setColor(Color.green);
         if(bought1 == false){
         g.fillRect(Window.getX(BuyXPos),Window.getY(BuyYPos),BuyWidth,BuyLength);
         g.setColor(Color.black);
         g.drawString("Buy",Window.getX(BuyXPos),Window.getY(BuyYPos+20));
         }
         if(bought2 == false){
         g.setColor(Color.green);
         g.fillRect(Window.getX(BuyXPos2),Window.getY(BuyYPos2),BuyWidth,BuyLength);
         g.setColor(Color.black);
         g.drawString("Buy",Window.getX(BuyXPos2),Window.getY(BuyYPos2+20));
         }
         if(bought3 == false){
         g.setColor(Color.green);
         g.fillRect(Window.getX(BuyXPos3),Window.getY(BuyYPos3),BuyWidth,BuyLength);
         g.setColor(Color.black);
         g.drawString("Buy",Window.getX(BuyXPos3),Window.getY(BuyYPos3+20));
         }
         if(bought4 == false){
         g.setColor(Color.green);
         g.fillRect(Window.getX(BuyXPos4),Window.getY(BuyYPos4),BuyWidth,BuyLength);
         g.setColor(Color.black);
         g.drawString("Buy",Window.getX(BuyXPos4),Window.getY(BuyYPos4+20));
         }
         if(bought5 == false){
         g.setColor(Color.green);
         g.fillRect(Window.getX(BuyXPos5),Window.getY(BuyYPos5),BuyWidth,BuyLength);
         g.setColor(Color.black);
         g.drawString("Buy",Window.getX(BuyXPos5),Window.getY(BuyYPos5+20));
         }
         
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
