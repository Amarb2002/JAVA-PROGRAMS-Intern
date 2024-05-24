import java.util.Calendar;
import java.text.SimpleDateFormat;

public class DayOfWeekInWords 
{
    public static void main(String[] args) 
{
    Calendar calendar = Calendar.getInstance();

    int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        String dayOfWeekInWords;
        switch (dayOfWeek) {
            case Calendar.SUNDAY:
                dayOfWeekInWords = "Sunday";
                break;
            case Calendar.MONDAY:
                dayOfWeekInWords = "Monday";
                break;
            case Calendar.TUESDAY:
                dayOfWeekInWords = "Tuesday";
                break;
            case Calendar.WEDNESDAY:
                dayOfWeekInWords = "Wednesday";
                break;
            case Calendar.THURSDAY:
                dayOfWeekInWords = "Thursday";
                break;
            case Calendar.FRIDAY:
                dayOfWeekInWords = "Friday";
                break;
            case Calendar.SATURDAY:
                dayOfWeekInWords = "Saturday";
                break;
            default:
                dayOfWeekInWords = "Invalid day";
                break;
        }

        System.out.println("Day of the week: " + dayOfWeekInWords);
    }
}
