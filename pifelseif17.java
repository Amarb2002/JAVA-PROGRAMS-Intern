 public class pifelseif17 {
    public static void main(String[] args) {
        int num = 2;
        if (num > 5) {
            System.out.println("The number is greater than 5.");
        } else if (num > 0) {
            System.out.println("The number is positive and less than or equal to 5.");
        } else if (num == 0) {
            System.out.println("The number is zero.");
        } else {
            System.out.println("The number is negative.");
        }
    }
}