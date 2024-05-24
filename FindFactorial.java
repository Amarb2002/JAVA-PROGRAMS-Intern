import java.util.Scanner;
public class FindFactorial
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number to calculate factorial:");
int num=sc.nextInt();
long fact=1;
for(int i=1;i<=num;i++)
{
fact=fact*i;
}
System.out.println("Factorial of  "+num+" is :"+fact);
}
}
 
//out put:
//Enter the number to calculate factorial:
//5
//Factorial of 5 is :120
