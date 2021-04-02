
package puzzlemaker;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Tasks {
    private String Name;
    private LocalDate DueDate;
    private int PointsWorth;
    private boolean Completed;
    private String Description;
    
    public void Tasks(LocalDate duedate)
    {
        DueDate=duedate;    
    }
    
    public void SetCompleted(boolean Set)
    {
        Completed=Set;
        
        if(Completed && LocalDate.now().compareTo(DueDate)==0)
        {
            PointsWorth+=5;
        }
    }
    
    public int ReturnDay()
    {
        return(DueDate.getDayOfMonth());
    }
    
    public int ReturnMonth()
    {
        return(DueDate.getMonthValue());
    }
    
    public int ReturnYear()
    {
        return(DueDate.getYear());
    }
    
}
