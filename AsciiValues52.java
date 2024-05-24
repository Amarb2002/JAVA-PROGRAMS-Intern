public class AsciiValues52 {
    public static void main(String[] args) {
        System.out.println("ASCII values from A to Z:");
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println(ch + ": " + (int) ch);
        }

        System.out.println("\nASCII values from a to z:");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println(ch + ": " + (int) ch);
        }
    }
}
