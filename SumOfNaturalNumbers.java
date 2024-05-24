import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("enter end number");
        int n = s.nextInt();
        int sum = 0;
        int i = 1;
        
        while (i <= n) {
            sum =sum + i;
            i++;
        }

        System.out.println("Sum of natural numbers from 1 to " + n + " is: " + sum);
    }
}
