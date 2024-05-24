import java.util.Scanner;
public class FibonacciSeries
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number for find fibonnacci sequence:");
int terms=sc.nextInt();
System.out.println("Fibonacci series up to"+ terms +"terms:");
int f1=0,f2=1;
for(int i=0;i<terms;i++)
{
System.out.print(f1+" ");
int f3=f1+f2;
f1=f2;
f2=f3;
}
}
}

//output:
//C:\Users\RAJU\Desktop\java internship>java FibonacciSeries
//Enter the number for find fibonnacci sequence:
//10
//Fibonacci series up to10terms:
//0 1 1 2 3 5 8 13 21 34