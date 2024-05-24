public class overloading
{
public static void print(int num)
{
System.out.println("Printing integer:"+num);
}
public static void print(double num)
{
System.out.println("Printing Double:"+num);
}
public static void print(String str)
{
System.out.println("Printing String:"+str);
}
public static void print(char ch)
{
System.out.println("Printing character:"+ch);
}
public static void main(String[] args)
{
print(10);
print(34.34);
print("Hello,World!");
print('A');
}
}

//output:
//Printing integer:10
//Printing Double:34.34
//Printing String:Hello,World!
//Printing character:A