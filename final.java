public class final {
    public static void main(String[] args) {
        try {
            int r= 10/0;
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
