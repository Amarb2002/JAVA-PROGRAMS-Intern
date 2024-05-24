import java.util.LinkedList;

public class LinkedListOperations2 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the front
        linkedList.addFirst("A");
        linkedList.addFirst("B");
	System.out.println("LinkedList after addFirst  " + linkedList);

        // Adding elements to the back
        linkedList.addLast("C");
        linkedList.addLast("D");
	System.out.println("LinkedList after addLast " + linkedList);

        // Removing elements from the front and back
        linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println("LinkedList after  removing from front and back: " + linkedList);
    }
}
