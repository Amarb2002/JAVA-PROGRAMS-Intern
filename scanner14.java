import java.util.Scanner;

public class scanner14 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Read and display integer
        System.out.print("Enter an integer: ");
        int integerValue = s.nextInt();
        System.out.println("You entered integer: " + integerValue);

        // Read and display double
        System.out.print("Enter a double: ");
        double doubleValue = s.nextDouble();
        System.out.println("You entered double: " + doubleValue);

        // Read and display string
        System.out.print("Enter a string: ");
        StringstringValue = s.nextLine();
        System.out.println("You entered string: " + stringValue);

}
