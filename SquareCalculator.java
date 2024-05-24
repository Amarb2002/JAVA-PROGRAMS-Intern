public class SquareCalculator
{
public static int calculate(int number)
{
return number*number;
}
public static void main(String args[])
{
int num=5;
int sqr=calculate(num);
System.out.println("The square of "+num+" is: "+sqr);
}
} 


//output:
//The square of 5 is: 25