public class swapwithoutvaraiable9 {

    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 20;

        num1 = num1 ^ num2;
	System.out.println(num1);
        num2 = num1 ^ num2;
	System.out.println(num2);
        num1 = num1 ^ num2;
	System.out.println(num1);
        System.out.println("After interchanging, num1 = " + num1 + " and num2 = " + num2);
    }
}

