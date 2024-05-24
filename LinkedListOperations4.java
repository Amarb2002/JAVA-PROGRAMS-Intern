import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListOperations4 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");

        // Iterating over the LinkedList
        System.out.println("Iterating over the LinkedList:");
        for (String element : linkedList) {
            System.out.println(element);
        }

       
    }
}
