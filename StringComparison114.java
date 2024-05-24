import java.util.Scanner;

public class StringComparison114
{
    public static void main(String[] args) 
{
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first string: ");
    String firstString = scanner.nextLine();

    System.out.print("Enter the second string: ");
    String secondString = scanner.nextLine();

    int comparisonResult = firstString.compareTo(secondString);

    if (comparisonResult < 0) 
{
    System.out.println("The first string is lexicographically less than the second string.");

        }

    else if (comparisonResult > 0) 
{
    System.out.println("The first string is lexicographically greater than the second string.");

        }
    else 
{
    System.out.println("Both strings are lexicographically equal.");

        }

        scanner.close();
    }
}
