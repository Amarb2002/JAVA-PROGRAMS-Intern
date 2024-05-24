public class MethodCallingDemo76 {

    public static void displaySquare(int number) {
        int square = number*number;
        System.out.println("The square of " + number + " is: " + square);
    }
    public static void main(String[] args) {
        int num = 5;
        displaySquare(num);
    }
}
