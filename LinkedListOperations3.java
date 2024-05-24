import java.util.LinkedList;

public class LinkedListOperations3 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");

        // Retrieving element by index
        String elementAtIndex2 = linkedList.get(2); // Retrieves element at index 2

        // Checking size and emptiness
        int size = linkedList.size();
        boolean isEmpty = linkedList.isEmpty();

        // Using poll and peek
        String polledElement = linkedList.poll(); // Retrieves and removes first element
        String peekedElement = linkedList.peek(); // Retrieves first element without removing

        System.out.println("Element at index 2: " + elementAtIndex2);
        System.out.println("Size of LinkedList: " + size);
        System.out.println("Is LinkedList empty? " + isEmpty);
        System.out.println("Polled Element: " + polledElement);
        System.out.println("Peeked Element: " + peekedElement);
    }
}
