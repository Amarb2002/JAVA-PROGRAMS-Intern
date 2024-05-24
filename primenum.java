public class primenum
{
public static void main(String[] args)
{
System.out.println("prime numbers between 1 and 50:");
for(int num=2;num<=50;num++)
{
boolean isPrime=true;
for(int i=2;i<=Math.sqrt(num);i++)
{
if(num%i==0)
{
isPrime=false;
break;
}
}
if(isPrime)
{
System.out.print(num+" ");
}
}
}
}

//out put:
//prime numbers between 1 and 50:
//2 3 5 7 11 13 17 19 23 29 31 37 41 43 47