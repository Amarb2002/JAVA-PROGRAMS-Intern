public class swapwithoutvaraiable8 {

    public static void main(String[] args) {
        int a = 100;
        int b = 5;

        a = a + b; //30
        b = a - b; //10
        a = a - b; //20

        System.out.println("After interchanging, a = " + a + " and b = " + b);
    }
}
