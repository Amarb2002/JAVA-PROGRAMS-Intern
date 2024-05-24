public class StringReverse
{
public static String revstr(String str)
{
if(str==null || str.isEmpty())
{
return str;
}
StringBuilder reversed=new StringBuilder();
for(int i=str.length()-1;i>=0;i--)
{
reversed.append(str.charAt(i));
}
return reversed.toString();
}
public static void main(String[] args)
{
String inputString="Hello,World!";
String reversedString=revstr(inputString);
System.out.println("Original String: "+inputString);
System.out.println("Reversed string: "+reversedString);
}
}

//Out Put:
//Original String: Hello,World!
//Reversed string: !dlroW,olleH