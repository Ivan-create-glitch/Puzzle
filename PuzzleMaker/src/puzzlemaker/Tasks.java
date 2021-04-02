
package puzzlemaker;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Tasks {
    private static int totalPoints;
    private String Name;
    private LocalDate DueDate;
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
            totalPoints+=5;
        }
        
    }
    
    public static int totPoints(){
        return(totalPoints);
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
