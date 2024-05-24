public class sumCalculator
{
public static int CalculateSum(int n1,int n2)
{
return n1+n2;
}
public static void main(String[] args)
{
int num1=23;
int num2=21;
int sum=CalculateSum(num1,num2);
System.out.println("The sum of "+num1+" and "+num2+" is : "+sum);
}
}

//output:
//The sum of 23 and 21 is : 44