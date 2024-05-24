import java.util.Calendar;
import java.text.SimpleDateFormat;

public class DateAfter45Days 
{
    public static void main(String[] args) 
{
       
        Calendar calendar = Calendar.getInstance();

        calendar.add(Calendar.DAY_OF_YEAR, 45);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Date after 45 days: " + sdf.format(calendar.getTime()));
    }
}
