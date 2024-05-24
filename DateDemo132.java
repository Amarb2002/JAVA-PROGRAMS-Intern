import java.util.Date;

public class DateDemo132 
{
    public static void main(String[] args) 
{

        Date currentDate = new Date();

        System.out.println("Current Date and Time: " + currentDate);

        long milliseconds = currentDate.getTime();

        System.out.println("Milliseconds since January 1, 1970: " + milliseconds);
    }
}
