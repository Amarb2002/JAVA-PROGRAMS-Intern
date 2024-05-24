import java.util.Scanner;

public class RandomNumberGenerator99
{
    public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of random numbers to generate: ");
        int count = scanner.nextInt();

        System.out.println("Random numbers:");
        for (int i = 0; i < count; i++) 
{
            double randomNumber = Math.random();
            System.out.println(randomNumber);
        }

        scanner.close();
    }
}
