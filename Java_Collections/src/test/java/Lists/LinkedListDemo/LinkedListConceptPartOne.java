package Lists.LinkedListDemo;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * This class demonstrates various operations on LinkedList in Java.
 *
 * A LinkedList in Java is a data structure that allows dynamic memory allocation.
 * It stores elements as a sequence of nodes, where each node contains a reference to
 * the next node in the sequence. Unlike arrays, LinkedLists allow easy insertion
 * and deletion without resizing or shifting elements.
 *
 * LinkedList implements the List and Deque interfaces and can act as a queue,
 * stack, or list depending on usage. It supports both duplicate and null values.
 */
public class LinkedListConceptPartOne {

    /**
     * Main method demonstrating various operations on LinkedList.
     */
    public static void main(String[] args) {

        // ----------------------------------
        // LinkedList Declaration Examples
        // ----------------------------------
        /*
         * Various ways to declare and initialize a LinkedList:
         *
         * 1. Generic LinkedList: Allows any type of data
         *      LinkedList userList = new LinkedList<>();
         *
         * 2. LinkedList with specific data type:
         *      LinkedList<Integer> integerList = new LinkedList<>();    // Stores only Integer values
         *      LinkedList<String> stringList = new LinkedList<>();      // Stores only String values
         */

        // Creating a generic LinkedList
        LinkedList userList = new LinkedList<>();

        // ----------------------------------
        // Adding Elements to LinkedList
        // ----------------------------------
        /*
         * LinkedList allows insertion of various types of elements,
         * including null values, primitive wrapper types, characters, etc.
         */
        userList.add("Hello World !!");  // Adding a String
        userList.add(null);             // Adding a null value
        userList.add(2354);             // Adding an Integer (autoboxed)
        userList.add('C');              // Adding a Character
        userList.add(56.345);           // Adding a Double (autoboxed)
        userList.add(true);             // Adding a Boolean
        System.out.println("All elements in the LinkedList: " + userList); // Display all elements

        // ----------------------------------
        // Retrieve Size of LinkedList
        // ----------------------------------
        System.out.println("LinkedList size: " + userList.size()); // Prints the number of elements

        // ----------------------------------
        // Removing Elements from LinkedList
        // ----------------------------------
        /*
         * LinkedList supports element removal by value or index.
         * If multiple elements with the same value exist, only the first occurrence is removed.
         */
        userList.remove("Hello World !!");   // Removing an element by its value
        // userList.remove(0);               // Uncomment to remove an element by index
        System.out.println("LinkedList after removing an element: " + userList);

        // ----------------------------------
        // Adding Element at Specific Index
        // ----------------------------------
        userList.add(0, "Hey there!");  // Adds "Hey there!" at index 0

        // ----------------------------------
        // Accessing and Replacing Elements
        // ----------------------------------
        /*
         * Retrieve element by index: get(index)
         * Replace element at index: set(index, newValue)
         */
        System.out.println("Element at index 2: " + userList.get(2)); // Accessing by index
        userList.set(0, "Good Morning Everyone"); // Replacing element at index 0
        System.out.println("LinkedList after replacing an element: " + userList);

        // ----------------------------------
        // Check for Existence of an Element
        // ----------------------------------
        System.out.println("Contains 'Good Morning Everyone': " + userList.contains("Good Morning Everyone")); // true
        System.out.println("Contains 'Hello': " + userList.contains("Hello")); // false

        // ----------------------------------
        // Check if LinkedList is Empty
        // ----------------------------------
        System.out.println("Is LinkedList empty? " + userList.isEmpty()); // false

        // ----------------------------------
        // Iterating Over LinkedList Elements
        // ----------------------------------

        // 1. Using a traditional for loop
        System.out.println("Reading elements using a for loop:");
        for (int i = 0; i < userList.size(); i++) {
            System.out.println(userList.get(i));
        }

        // 2. Using a for-each loop
        System.out.println("Reading elements using a for-each loop:");
        for (Object element : userList) {
            System.out.println(element);
        }

        // 3. Using an Iterator
        System.out.println("Reading elements using an Iterator:");
        Iterator iterator = userList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
