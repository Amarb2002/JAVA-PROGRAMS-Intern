import java.util.ArrayList;

public class ArrayListDemo 
{
    public static void main(String[] args) 
{

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        System.out.println("ArrayList after adding elements: " + arrayList);

        arrayList.remove("Banana");

        System.out.println("ArrayList after removing an element: " + arrayList);
    }
}
