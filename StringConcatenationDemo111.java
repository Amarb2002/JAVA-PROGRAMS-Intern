public class StringConcatenationDemo111 
{
    public static void main(String[] args) 
{
        String str1 = "Hello";
        String str2 = "World";

        String concatenatedString1 = str1 + " " + str2;
        System.out.println("Concatenated String using + operator: " + concatenatedString1);

        String concatenatedString2 = str1.concat(" ").concat(str2);
        System.out.println("Concatenated String using concat() method: " + concatenatedString2);
    }
}
