import java.util.*;
class leapy20{
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the year");
int y= s.nextInt();
if((y%4)==0)
{
System.out.println(y+"its a leap year");
}
else if((y%100)==0){
System.out.println(y+"its a leap year");
}
else
{
System.out.println(y+"its not a leap year");
}
}
}