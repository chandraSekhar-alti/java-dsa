package Queue;


import java.util.LinkedList;
import java.util.Queue;

/**
 * This class demonstrates the basic concepts and operations of the LinkedListQueue class in Java.
 *LinkedList implements the Queue interface and follow FIFO Order.
 * It allows null values and also can be used as Deque (Double ended queue).
 */
public class LInkedList {

    public static void main(String[] args) {
        // Creating queue using linkedList
        Queue<String> q = new LinkedList<>();
        /**
         * Adding elements to the LinkedList Queue
         *      - add() : insert the specific element into the queue
         *      -offer() : Similar to add() but returns falls instead of throwing an exception if insertion fails
         */

        q.add("A");
        q.add("B");
        q.add("C");
        q.add("D");
        q.offer("Hello");

        // Displaying the Queue
        System.out.println("Q : " + q);   // Elements are maintained in insertion order


        /* Retrieving the head element without removing it
           - element(): Retrieves but does not remove the head. Throws NoSuchElementException if empty.
           - peek(): Retrieves but does not remove the head. Returns null if empty. */
        System.out.println("Header element got by element method is : " + q.element());
        System.out.println("Header element got by peek method is : " + q.peek());
        System.out.println("Q : " + q);  // Queue remains unchanged

        /* Removing and returning elements from the LinkedList Queue
           - remove(): Removes and returns the head. Throws NoSuchElementException if empty.
           - poll(): Removes and returns the head. Returns null if empty. */
        System.out.println("Return value from the remove method is : " + q.remove());
        System.out.println("Q after removing the element by using remove method is : " + q);

        System.out.println("Return value from the poll method is : " + q.poll());
        System.out.println("Q after removing the element by using poll method is : " + q);
    }

}
