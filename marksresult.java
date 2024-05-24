import java.util.*;
public class marksresult
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in); 
System.out.println("Enter your obtained marks");
int marks=sc.nextInt();
if(marks>=35 && marks<=50)
{
System.out.println("PASS");
}
else if(marks>50 && marks<=60)
{
System.out.println("Second Class");
}
else if(marks>60 && marks<=75)
{
System.out.println("First class");
}
else if(marks>75 && marks<=100)
{
System.out.println("Distinction");
}
else
{
System.out.println("FAIL");
}
}
}

//out put:
//C:\Users\RAJU\Desktop\java internship>java marksresult
//Enter your obtained marks
//67
//First class

//C:\Users\RAJU\Desktop\java internship>java marksresult
//Enter your obtained marks
//34
//FAIL