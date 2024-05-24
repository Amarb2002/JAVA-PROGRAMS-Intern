public class NumberMessages41 {
    public static void main(String[] args) {
        for (int number = 1; number <= 30; number++) {
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("hi hello");
            } else if (number % 3 == 0) {
                System.out.println("hi");
            } else if (number % 5 == 0) {
                System.out.println("hello");
            } else {
                System.out.println(number);
            }
        }
    }
}
