import java.util.Scanner;

public class StringCaseConverter115 
{
    public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String upperCaseString = inputString.toUpperCase();

        String lowerCaseString = inputString.toLowerCase();

        System.out.println("Uppercase string: " + upperCaseString);
        System.out.println("Lowercase string: " + lowerCaseString);

        scanner.close();
    }
}
