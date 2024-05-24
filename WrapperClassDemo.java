public class WrapperClassDemo 
{
    public static void main(String[] args) 
{

        Integer integerValue = 10;       
        Double doubleValue = 3.14;      
        Character charValue = 'A';      
        Boolean booleanValue = true;   

        System.out.println("Integer value: " + integerValue);
        System.out.println("Double value: " + doubleValue);
        System.out.println("Character value: " + charValue);
        System.out.println("Boolean value: " + booleanValue);

        int intValueFromWrapper = integerValue;
        double doubleValueFromWrapper = doubleValue;
        char charValueFromWrapper = charValue;
        boolean booleanValueFromWrapper = booleanValue;

        System.out.println("Unboxed Integer value: " + intValueFromWrapper);
        System.out.println("Unboxed Double value: " + doubleValueFromWrapper);
        System.out.println("Unboxed Character value: " + charValueFromWrapper);
        System.out.println("Unboxed Boolean value: " + booleanValueFromWrapper);
    }
}
