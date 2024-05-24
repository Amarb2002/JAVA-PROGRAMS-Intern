import java.util.*;
public class Palindromecheck
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int num=sc.nextInt();
int res=0,temp;
temp=num;
while(num>0)
{
int digit=num%10;
res=(res*10)+digit;
num=num/10;
}
if(temp==res)
{
System.out.println(temp+" is Palindrome number.");
}
else
{
System.out.println(temp+" is not Palindrome.");
}
}
}

//output:
//Enter a number:
//56
//56 is not Palindrome.

//Enter a number:
//333
//333 is Palindrome number.