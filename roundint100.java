import java.util.Scanner;
public class roundint100
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter floating point number");
double number=sc.nextDouble();
long roundnum=Math.round(number);
System.out.println("the nearest integer to "+number+"is:"+roundnum);
sc.close();
}
}
