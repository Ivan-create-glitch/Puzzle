
package puzzlemaker;

import java.util.Scanner;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class CreatePage   
    {
 
    static int ButtonLength = 70;
    static int ButtonWidth = 70;
    static int ButtonXPos = 0;
    static int ButtonYPos = 0;
    public static boolean LetType;
    private static boolean TypeName=true;
     private static boolean TypeDate=false;
      private static boolean TypeDescription=false;
    private static String Typed="";
     private static String TypedDate="";
      private static String TypedDesc="";
    
    public static void Draw(Graphics2D g)
    {
        
        TypeName=true;
        TypeDate=false;
        TypeDescription=false;
      
        g.setColor(Color.white);
        g.fillRect(0, 0, Window.xsize, Window.ysize);
        
        g.setFont(new Font("Arial",Font.PLAIN,30));
         g.setColor(Color.red);
         g.fillRect(Window.getX(ButtonXPos),Window.getY(ButtonYPos),ButtonWidth,ButtonLength);
         g.setColor(Color.black);
         g.drawString("X",Window.getX(ButtonXPos+ButtonWidth/2),Window.getY(ButtonYPos+ButtonLength/2));
         


         
//         g.drawString("Name of Task:",Window.WINDOW_WIDTH/3+30,Window.WINDOW_HEIGHT/4);
//         g.drawString(Typed,Window.WINDOW_WIDTH/3+30,Window.WINDOW_HEIGHT/4);
         
         

         if(TypeName)
         g.drawString("Type name of Task",Window.WINDOW_WIDTH/3+30,Window.WINDOW_HEIGHT/4);
         if(TypeDate)
         g.drawString("Type DueDate of Task (yyyy/mm/dd)",Window.WINDOW_WIDTH/3+30,Window.WINDOW_HEIGHT/4);    
         if(TypeDescription)
         g.drawString("Type Description of Task",Window.WINDOW_WIDTH/3+30,Window.WINDOW_HEIGHT/4);
         
         g.drawString(Typed,Window.WINDOW_WIDTH/3+30,Window.WINDOW_HEIGHT/2);
         g.drawString(TypedDate,Window.WINDOW_WIDTH/3+30,Window.WINDOW_HEIGHT/2+30);
         g.drawString(TypedDesc,Window.WINDOW_WIDTH/3+30,Window.WINDOW_HEIGHT/2+60);
             }
    
    
    public static void LetType(boolean set)
    {
        LetType=set;
         System.out.println("LetType ="+"  "+LetType);
    }
    
    public static void Typing()
    {
                if(LetType)
                {
                    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter");
    
    if(TypeName)
    {
       Typed = "";
         TypedDate = "";
         TypedDesc = "";

    Typed = myObj.nextLine();  // Read user input 
    TypeDate=true;
    TypeName=false;
    
    }
    
    if(TypeDate)
    {
        System.out.println("Due Date:");
     Typed = myObj.nextLine();  // Read user input   
     TypeDescription=true;
     TypeDate=false;
    }
    
    if(TypeDescription)
    {        
         CalendarPage.points+=5;
        System.out.println("Extra details");
      Typed = myObj.nextLine();  // Read user input  
      TypeDescription=false;
    }
    
    
                }
            
            
            
        }
    }
    

