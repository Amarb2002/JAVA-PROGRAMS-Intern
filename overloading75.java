public class overloading75 {

    // Method to print an integer
    public static void print(int num) {
        System.out.println("Printing integer: " + num);
    }

    // Method to print a double
    public static void print(double num) {
        System.out.println("Printing double: " + num);
    }

    // Method to print a string
    public static void print(String str) {
        System.out.println("Printing string: " + str);
    }

    // Method to print a character
    public static void print(char ch) {
        System.out.println("Printing character: " + ch);
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Call the print methods with different parameters
        print(10);
        print(3.14);
        print("Hello, World!");
        print('A');
    }
}
