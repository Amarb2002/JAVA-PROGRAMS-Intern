public class numberreverse
{
public static int reversedNumber(int number)
{
int reversedNumber=0;
while(number!=0)
{
int digit=number%10;
reversedNumber=reversedNumber*10+digit;
number=number/10;
}
return reversedNumber;
}
public static void main(String[] args)
{
int inputNumber=12345;
int reversedNumber=reversedNumber(inputNumber);
System.out.println("Original number:"+inputNumber);
System.out.println("Reversed Number:"+reversedNumber);
}
}

//Out Put:
//Original number:12345
//Reversed Number:54321