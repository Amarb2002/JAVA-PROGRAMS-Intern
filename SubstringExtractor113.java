import java.util.Scanner;

public class SubstringExtractor113
{
    public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the original string: ");
        String originalString = scanner.nextLine();

        System.out.print("Enter the starting index of the substring: ");
        int startIndex = scanner.nextInt();

        System.out.print("Enter the ending index of the substring: ");
        int endIndex = scanner.nextInt();

        String substring = originalString.substring(startIndex, endIndex);

        System.out.println("Substring extracted from the original string: " + substring);

        scanner.close();
    }
}
