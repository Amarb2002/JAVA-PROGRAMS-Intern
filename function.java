class function{
public int add(int a,int b)
{
int sum;
sum=a+b;
return sum;
}
public static void main(String[] args)
{
function f=new function();
System.out.println("The Sum is:"+f.add(4,5));
}
}