package Queue;

import java.util.PriorityQueue;

/**
 * This class demonstrates the basic concepts and operations of the PriorityQueue class in Java.
 * PriorityQueue is a part of Java Collections Framework and follows a natural ordering (Min-Heap by default).
 * It does not allow null values and is useful for priority-based processing.
 *
 * Differences between remove() and poll():
 * - remove() throws an exception if the queue is empty.
 * - poll() returns null if the queue is empty.
 */
public class PriorityQueueDemo {

    public static void main(String[] args) {
        // Creating a PriorityQueue of Strings
        PriorityQueue<String> q = new PriorityQueue<>();

        /* Adding elements to the PriorityQueue
           - add(E e): Inserts the specified element into the queue.
           - offer(E e): Similar to add(), but returns false instead of throwing an exception if insertion fails. */
        q.add("A");
        q.add("B");
        q.add("C");
        q.offer("D");
        q.offer(null);

        // Displaying the PriorityQueue
        System.out.println("Q : " + q);   // Elements may not be in insertion order due to priority-based arrangement

        /* Retrieving the head element without removing it
           - element(): Retrieves but does not remove the head. Throws NoSuchElementException if empty.
           - peek(): Retrieves but does not remove the head. Returns null if empty. */
        System.out.println("Header element got by element method is : " + q.element());
        System.out.println("Header element got by peek method is : " + q.peek());
        System.out.println("Q : " + q);  // Queue remains unchanged

        /* Removing and returning elements from the PriorityQueue
           - remove(): Removes and returns the head. Throws NoSuchElementException if empty.
           - poll(): Removes and returns the head. Returns null if empty. */
        System.out.println("Return value from the remove method is : " + q.remove());
        System.out.println("Q after removing the element by using remove method is : " + q);

        System.out.println("Return value from the poll method is : " + q.poll());
        System.out.println("Q after removing the element by using poll method is : " + q);
    }
}
