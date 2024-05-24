import java.util.Scanner;
public class Greatestofthree
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter three numbers to find greatest number among three:");
int num1=sc.nextInt();
int num2=sc.nextInt();
int num3=sc.nextInt();
int large=num1;
if(num2>large)
{
large=num2;
}
if(num3>large)
{
large=num3;
}
System.out.println("The greatest number among three numbers is:"+large);
}
}
 
//out put:
//Enter three numbers to find greatest number among three:
//8
//56
//98
//The greatest number among three numbers is:98