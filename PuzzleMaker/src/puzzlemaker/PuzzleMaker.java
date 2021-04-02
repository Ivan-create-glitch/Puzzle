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


public class PuzzleMaker extends JFrame implements Runnable {
    boolean animateFirstTime = true;
    Image image;
    Graphics2D g;

    boolean CalendarSwitch = false;
    boolean InstructionSwitch = false;
    
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
                   if(x>=StartPage.ButtonXPos && x<=StartPage.ButtonXPos+StartPage.ButtonWidth
                    && y>=StartPage.ButtonYPos && y<=StartPage.ButtonYPos+StartPage.ButtonLength)
                   {
                      CalendarSwitch = true;
                   }
                   if(x>=StartPage.InstructionsXPos && x<=StartPage.InstructionsXPos+StartPage.underlineLength
                    && y<=StartPage.underlineYPos && y>=StartPage.underlineYPos-30)
                   {
                      InstructionSwitch = true;
                   }
                   if(x>=InstructionPage.ButtonXPos && x<=InstructionPage.ButtonXPos+InstructionPage.ButtonWidth
                    && y>=InstructionPage.ButtonYPos && y<=InstructionPage.ButtonYPos+InstructionPage.ButtonLength)
                   {
                     InstructionSwitch = false;
                   }
                }
                if (e.BUTTON3 == e.getButton()) {
                    
                    int x = e.getX() - Window.getX(0);
                    int y = e.getY() - Window.getY(0);

                }
                repaint();
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
       
         if(CalendarSwitch==false && InstructionSwitch==false)
         StartPage.Draw(g);
         
         if(CalendarSwitch)
             CalendarPage.Draw(g);
         
         if(InstructionSwitch)
             InstructionPage.Draw(g);
       
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

            reset();

        }

       
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