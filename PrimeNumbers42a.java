public class PrimeNumbers42a {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 50:");
	int flag=0;
        for (int number = 2; number <= 50; number++) {
            for (int i = 2; i <= number; i++) {
                if (number % i == 0) {
                    flag=1;
                }
		if(flag==1){
		System.out.println(i);
		}
            }
        }
    }
}
