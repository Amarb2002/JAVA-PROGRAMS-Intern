import java.util.Calendar;
import java.util.Date;

public class DateInfoRetriever133 
{
    public static void main(String[] args) 
{

        Calendar calendar = Calendar.getInstance();

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // Month index starts from 0
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println("Current Year: " + year);
        System.out.println("Current Month: " + month);
        System.out.println("Current Day of Month: " + dayOfMonth);
    }
}
