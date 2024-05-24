public class pnestedif18 {
    public static void main(String[] args) {
        int num = 10;
        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println("The number is even.");
            } else {
                System.out.println("The number is odd.");
            }
        } else {
            System.out.println("The number is negative or zero.");
        }
    }
}