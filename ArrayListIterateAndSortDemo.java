import java.util.ArrayList;
import java.util.Collections;

public class ArrayListIterateAndSortDemo 
{
    public static void main(String[] args) 
{
    
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Orange");
        arrayList.add("Apple");
        arrayList.add("Banana");

        System.out.println("Iterating over ArrayList:");
        for (String element : arrayList) 
{
            System.out.println(element);
        }

        Collections.sort(arrayList);

        System.out.println("\nArrayList after sorting:");
        for (String element : arrayList) 
{
            System.out.println(element);
        }
    }
}
