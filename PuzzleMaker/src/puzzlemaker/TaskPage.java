package puzzlemaker;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;



public class TaskPage 
{
    static int ButtonLength = 70;
    static int ButtonWidth = 70;
    static int ButtonXPos = 0;
    static int ButtonYPos = 0;
    
    static int CreateButtonLength = 75;
    static int CreateButtonWidth = 180;
    static int CreateButtonXPos = 210;
    static int CreateButtonYPos = 255;
    
    //Year, Month, then Day
    public static Tasks TasksArray[];
    public static Tasks CurrentTask;
    
    public static void Draw(Graphics2D g)
    {
        g.setColor(Color.white);
        g.fillRect(0, 0, Window.xsize, Window.ysize);
        
            g.setFont(new Font("Arial",Font.PLAIN,30));
         g.setColor(Color.red);
         g.fillRect(Window.getX(ButtonXPos),Window.getY(ButtonYPos),ButtonWidth,ButtonLength);
         g.setColor(Color.black);
         g.drawString("X",Window.getX(ButtonXPos+ButtonWidth/2),Window.getY(ButtonYPos+ButtonLength/2));
         
         if(CurrentTask!=null)
         {
             g.setColor(Color.black);
         g.drawString("Name:",Window.WINDOW_WIDTH/3 ,Window.WINDOW_HEIGHT/4);
         g.drawString("DueDate:",Window.WINDOW_WIDTH/3,Window.WINDOW_HEIGHT/4*2);
         g.drawString("Description:",Window.WINDOW_WIDTH/3,Window.WINDOW_HEIGHT/3);
             
         }
         
         else
         {
             g.setColor(Color.black);
         g.drawString("No Task Set",Window.WINDOW_WIDTH/3+30,Window.WINDOW_HEIGHT/4);
         
         g.setFont(new Font("Arial",Font.PLAIN,20));
         g.setColor(Color.green);
         g.fillRect(Window.getX(CreateButtonXPos),Window.getY(CreateButtonYPos),CreateButtonWidth,CreateButtonLength);
         g.setColor(Color.black);
         g.drawString("Create New Task",Window.getX(CreateButtonXPos+10),Window.getY(CreateButtonYPos+CreateButtonLength/2));
         }
    }
    
    public void AddTask(Tasks adding)
    {
        TasksArray[adding.ReturnDay()]=adding;
    }
    public void CheckLength()
    {
        if(TasksArray.length==7)
            CalendarPage.points+=5;
    }
    
    public static void SetTask(int day)
    {
        CurrentTask=TasksArray[day];
    }
    
}



