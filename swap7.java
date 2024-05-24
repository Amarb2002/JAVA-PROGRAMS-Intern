//7.Write a program to inter change 2 number with 3rd variable 
public class swap7 {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int temp;

        temp = num1;  //10
        num1 = num2;  //20
        num2 = temp;  //10

        System.out.println("After interchanging, num1 = " + num1 + " and num2 = " + num2);
    }
}
