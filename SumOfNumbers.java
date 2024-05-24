public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;    //sum = sum +i; 
	   System.out.println("itartion  " + i +"sum=  "+ sum);
        }

        System.out.println("Sum of numbers from 1 to 10 is: " + sum);
    }
}
