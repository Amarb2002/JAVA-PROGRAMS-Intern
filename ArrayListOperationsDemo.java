import java.util.ArrayList;

public class ArrayListOperationsDemo 
{
    public static void main(String[] args) 
{
   
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Orange");
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Grapes");
        arrayList.add("Mango");

        ArrayList<String> subList = new ArrayList<>(arrayList.subList(1, 4));
        System.out.println("Sublist: " + subList);

        String[] array = arrayList.toArray(new String[0]);

        System.out.println("Array from ArrayList:");
        for (String element : array)
{
            System.out.println(element);
        }

        arrayList.clear();
        System.out.println("ArrayList after clearing: " + arrayList);
    }
}
