import java.util.*;
public class drivinglicenceEligibility
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter your age");
int age=sc.nextInt();
if(age>17)
{
System.out.println("eligible for driving license");
}
else
{
System.out.println("Not eligible yet,wait for"+ (17-age) +"years");
}
}
}

//output:Enter your age
//12
//Not eligible yet,wait for5years

//C:\Users\RAJU\Desktop\java internship>java drivinglicenceEligibility
//Enter your age
//23
//eligible for driving license