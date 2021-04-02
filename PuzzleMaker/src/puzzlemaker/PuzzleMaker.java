/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puzzlemaker;

import java.io.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class PuzzleMaker extends JFrame implements Runnable {
    boolean animateFirstTime = true;
    Image image;
    Graphics2D g;

    
    Image puzzleImage;
    
    boolean CalendarSwitch = false;
    boolean InstructionSwitch = false;
    boolean WorkshopSwitch = false;
    boolean ShopSwitch = false;

    boolean TaskSwitch = false;
    boolean CreateSwitch = false;
    boolean StartSwitch = true;
    
   
    
    public static void main(String[] args) {
        PuzzleMaker frame = new PuzzleMaker();
        frame.setSize(Window.WINDOW_WIDTH, Window.WINDOW_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public PuzzleMaker() {
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {

                if (e.BUTTON1 == e.getButton() ) {
                    int x = e.getX() - Window.getX(0);
                    int y = e.getY() - Window.getY(0);
                    
                   ///////////// TaskSwitching
///////////////////////////////////////// TaskSwitching
                   if(TaskSwitch)
                   {
                       if(x>=TaskPage.ButtonXPos && x<=TaskPage.ButtonXPos+TaskPage.ButtonWidth
                       && y>=TaskPage.ButtonYPos && y<=TaskPage.ButtonYPos+TaskPage.ButtonLength)
                       {
                           TaskSwitch=false;
                           CalendarSwitch=true;
                       }
                        
                       if(x>=TaskPage.CreateButtonXPos && x<=TaskPage.CreateButtonXPos+TaskPage.CreateButtonWidth
                       && y>=TaskPage.CreateButtonYPos && y<=TaskPage.CreateButtonYPos+TaskPage.CreateButtonLength)
                       {
                           TaskSwitch=false;
                           CreateSwitch=true;
                           CreatePage.LetType(true);
                           
                       }
                   }
                   
                   else if( CalendarSwitch==true)    
                   {
                       int CalendarYDelta=CalendarPage.ReturnHeight()/CalendarPage.ReturnRows();
                       int CalendarXDelta=CalendarPage.ReturnWidth()/CalendarPage.ReturnColumns();
                       
                        for(int zy = 1;zy<=CalendarPage.ReturnRows()-1;zy++)
                        {
                           for(int zx = 1;zx <=CalendarPage.ReturnColumns();zx ++) 
                           {
                               

                             if(x>=Window.getX(zx*CalendarXDelta)&& x<=Window.getX((zx+1)*CalendarXDelta)
                             && y>=Window.getY(zy*CalendarYDelta)&& y<=Window.getY((zy+1)*CalendarYDelta))
                                 {
                                     
                                     if(zy*7-(7-zx)<31&&TaskPage.TasksArray!=null&&TaskPage.TasksArray[(zy*7)+zx]!=null)
                                     {
                                         TaskPage.SetTask((zy*7)+zx);
                                     }
                                    
                                     CalendarSwitch=false;
                                     InstructionSwitch=false;
                                     StartSwitch=false;
                                     TaskSwitch=true;
                                     
                                     
                                 }  
                           }
                        }
                       
                   }

////////////////////////////////////////////////////                        
////////////////////////////////////////CreateSwitch
                    if(CreateSwitch)
                    {
                        if(x>=CreatePage.ButtonXPos && x<=CreatePage.ButtonXPos+CreatePage.ButtonWidth
                       && y>=CreatePage.ButtonYPos && y<=CreatePage.ButtonYPos+CreatePage.ButtonLength)
                       {
                           CreatePage.LetType(false);
                           CreateSwitch=false;
                           TaskSwitch=true;
                       }
                    }
                  
 /////////////////////////////////////////////////////////////////                       
                   
                   
                   
                   
                   
                   if(x>=CalendarPage.ButtonXPos && x<=CalendarPage.ButtonXPos+CalendarPage.ButtonWidth
                    && y>=CalendarPage.ButtonYPos && y<=CalendarPage.ButtonYPos+CalendarPage.ButtonLength)
                   {
                     CalendarSwitch = false;
                     StartSwitch = true;
                     
                   }
                   if(x>=CalendarPage.BuildButtonXPos && x<=CalendarPage.BuildButtonXPos+CalendarPage.ShopButtonWidth
                    && y>=CalendarPage.BuildButtonYPos && y<=CalendarPage.BuildButtonYPos+CalendarPage.ButtonLength)
                   {
                     WorkshopSwitch = true;
                     CalendarSwitch = false;
                   }
                   if(x>=CalendarPage.ShopButtonXPos && x<=CalendarPage.ShopButtonXPos+CalendarPage.ShopButtonWidth
                    && y>=CalendarPage.ShopButtonYPos && y<=CalendarPage.ShopButtonYPos+CalendarPage.ButtonLength)
                   {
                     ShopSwitch = true;
                     CalendarSwitch = false;
                   }
                   if(x>=PuzzleShopPage.ButtonXPos && x<=PuzzleShopPage.ButtonXPos+PuzzleShopPage.ButtonWidth
                    && y>=PuzzleShopPage.ButtonYPos && y<=PuzzleShopPage.ButtonYPos+PuzzleShopPage.ButtonLength)
                   {
                     ShopSwitch = false;
//                     CalendarSwitch = true;
                   }
                   if(x>=PuzzleWorkshopPage.ButtonXPos && x<=PuzzleWorkshopPage.ButtonXPos+PuzzleWorkshopPage.ButtonWidth
                    && y>=PuzzleWorkshopPage.ButtonYPos && y<=PuzzleWorkshopPage.ButtonYPos+PuzzleWorkshopPage.ButtonLength)
                   {
                     WorkshopSwitch = false;
//                     CalendarSwitch = true;
                   }

                   
                   
                   
                   
                   //////// 
                    if(StartSwitch)
                    {
                        if(x>=StartPage.ButtonXPos && x<=StartPage.ButtonXPos+StartPage.ButtonWidth
                         && y>=StartPage.ButtonYPos && y<=StartPage.ButtonYPos+StartPage.ButtonLength)
                        {
                           CalendarSwitch = true;
                           StartSwitch=false;
                        }
                        if(x>=StartPage.InstructionsXPos && x<=StartPage.InstructionsXPos+StartPage.underlineLength
                         && y<=StartPage.underlineYPos && y>=StartPage.underlineYPos-30)
                        {
                           InstructionSwitch = true;
                           StartSwitch=false;
                        }
                        if(x>=InstructionPage.ButtonXPos && x<=InstructionPage.ButtonXPos+InstructionPage.ButtonWidth
                         && y>=InstructionPage.ButtonYPos && y<=InstructionPage.ButtonYPos+InstructionPage.ButtonLength)
                        {
                          InstructionSwitch = false;
                          StartSwitch=true;
                        }      
                    }
                   
                       
                   
                   
                }
                if (e.BUTTON3 == e.getButton()) {
                    
                    int x = e.getX() - Window.getX(0);
                    int y = e.getY() - Window.getY(0);

               
                repaint();
            }
            }
        });

    addMouseMotionListener(new MouseMotionAdapter() {
      public void mouseDragged(MouseEvent e) {

        repaint();
      }
    });

    addMouseMotionListener(new MouseMotionAdapter() {
      public void mouseMoved(MouseEvent e) {
        int x = e.getX() - Window.getX(0);
        int y = e.getY() - Window.getY(0);
     
        repaint();
      }
    });

        addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent e) {
                if (e.VK_UP == e.getKeyCode()) {
                } else if (e.VK_DOWN == e.getKeyCode()) {
                } else if (e.VK_LEFT == e.getKeyCode()) {
                } else if (e.VK_RIGHT == e.getKeyCode()) {
                } else if (e.VK_ESCAPE == e.getKeyCode()) {
                    reset();
                }
                repaint();
            }
        });
        init();
        start();
    }
    Thread relaxer;
////////////////////////////////////////////////////////////////////////////
    public void init() {
        requestFocus();
    }
////////////////////////////////////////////////////////////////////////////
    public void destroy() {
    }
////////////////////////////////////////////////////////////////////////////
    public void paint(Graphics gOld) {
        if (image == null || Window.xsize != getSize().width || Window.ysize != getSize().height) {
            Window.xsize = getSize().width;
            Window.ysize = getSize().height;
            image = createImage(Window.xsize, Window.ysize);
            g = (Graphics2D) image.getGraphics();
            Drawing.setDrawingInfo(g,this);
            g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
        }
//fill background
       
        g.setColor(Color.blue);
        g.fillRect(0, 0, Window.xsize, Window.ysize);

        int x[] = {Window.getX(0), Window.getX(Window.getWidth2()), Window.getX(Window.getWidth2()), Window.getX(0), Window.getX(0)};
        int y[] = {Window.getY(0), Window.getY(0), Window.getY(Window.getHeight2()), Window.getY(Window.getHeight2()), Window.getY(0)};
//fill border
        if(InstructionSwitch == true)
            g.setColor(Color.black);
        else
        g.setColor(Color.white);
        g.fillPolygon(x, y, 4);
// draw border
        g.setColor(Color.red);
        g.drawPolyline(x, y, 5);

        if (animateFirstTime) {
            gOld.drawImage(image, 0, 0, null);
            return;
        }
        if(StartSwitch)
        g.drawImage(puzzleImage,Window.getX(0),Window.getY(0),
                Window.getWidth2(),Window.getHeight2(),this);
       
         if(CalendarSwitch==false && InstructionSwitch==false
            && WorkshopSwitch==false && ShopSwitch == false && StartSwitch == false)
        if(CreateSwitch)
        { 
          CreatePage.Draw(g);
        }
         if(StartSwitch)
         StartPage.Draw(g);
         
           if(CalendarSwitch)
             CalendarPage.Draw(g);
         
           if(TaskSwitch)
          TaskPage.Draw(g);
          
          
         
         
         if(InstructionSwitch && TaskSwitch==false && !CalendarSwitch)
             InstructionPage.Draw(g);
         

         if(WorkshopSwitch)
             PuzzleWorkshopPage.Draw(g);
         
         if(ShopSwitch)
             PuzzleShopPage.Draw(g);

        gOld.drawImage(image, 0, 0, null);
    }

////////////////////////////////////////////////////////////////////////////
// needed for     implement runnable
    public void run() {
        while (true) {
            animate();
            repaint();
            double seconds = .1;    //time that 1 frame takes.
            int miliseconds = (int) (1000.0 * seconds);
            try {
                Thread.sleep(miliseconds);
            } catch (InterruptedException e) {
            }
        }
    }
   
/////////////////////////////////////////////////////////////////////////
    public void reset() {
        CalendarSwitch = false;
        InstructionSwitch = false;
        WorkshopSwitch = false;
        ShopSwitch = false;
        StartSwitch=true;
        TaskSwitch=false;
        CreateSwitch=false;
       // Player.Reset();
       // Board.Reset();
    }
/////////////////////////////////////////////////////////////////////////
    public void animate() {

        if (animateFirstTime) {
            animateFirstTime = false;
            if (Window.xsize != getSize().width || Window.ysize != getSize().height) {
                Window.xsize = getSize().width;
                Window.ysize = getSize().height;
            }
            puzzleImage = Toolkit.getDefaultToolkit().getImage("./puzzleImage.jpg");
            reset();

        }

        CreatePage.Typing();
       
    }
    public static class Drawing {
    private static Graphics2D g;
    private static PuzzleMaker mainClassInst;

    public static void setDrawingInfo(Graphics2D _g,PuzzleMaker _mainClassInst) {
        g = _g;
        mainClassInst = _mainClassInst;
        }
    public static PuzzleMaker getMain(){
    return(mainClassInst);
        }
    public static Graphics2D getG(){
    return g;
        }
    }

////////////////////////////////////////////////////////////////////////////
    public void start() {
        if (relaxer == null) {
            relaxer = new Thread(this);
            relaxer.start();
        }
    }
////////////////////////////////////////////////////////////////////////////
    public void stop() {
        if (relaxer.isAlive()) {
            relaxer.stop();
        }
        relaxer = null;
    }


}