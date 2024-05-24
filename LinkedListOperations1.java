import java.util.LinkedList;

public class LinkedListOperations1 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
	System.out.println(linkedList);

        // Adding element at specific index
        linkedList.add(1, "D"); // Adds "D" at index 1
	System.out.println("LinkedList after adding  " + linkedList);

        // Removing element at specific index
        linkedList.remove(2); // Removes element at index 2

        System.out.println("LinkedList after  removing elements: " + linkedList);
    }
}
