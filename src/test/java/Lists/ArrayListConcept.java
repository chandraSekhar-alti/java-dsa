package Lists;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * This class demonstrates the basic concepts and operations of the ArrayList class in Java.
 * ArrayList is a resizable array implementation of the List interface.
 * It is part of the Java Collections Framework and is widely used for storing dynamic data.
 */
public class ArrayListConcept {

    /**
     * Main method demonstrating various operations on ArrayList.
     */
    public static void main(String[] args) {
        // Declaration: Various ways to declare an ArrayList in Java
        /*
            ArrayList<String> temp = new ArrayList<>();   // ArrayList to store Strings
            ArrayList<Integer> temp = new ArrayList<>(); // ArrayList to store Integers
            ArrayList temp = new ArrayList<>();          // Non-generic ArrayList (raw type)
            List temp = new ArrayList<>();               // Polymorphic declaration
         */

        // Creating a raw-type ArrayList (not type-safe)
        ArrayList temp = new ArrayList<>();

        // Adding elements to the ArrayList using the add() method
        temp.add(50);               // Adding an integer
        temp.add(true);             // Adding a boolean
        temp.add("Hello World !!"); // Adding a string
        temp.add(10.56);            // Adding a double
        temp.add('C');              // Adding a character

        System.out.println("Initial ArrayList: " + temp); // [50, true, Hello World !!, 10.56, C]

        // Retrieving the size of the ArrayList
        System.out.println("Number of elements in the ArrayList: " + temp.size()); // 5

        // Removing elements from the ArrayList
        temp.remove("Hello World !!"); // Removes element "Hello World !!"
        System.out.println("After removing an element: " + temp); // [50, true, 10.56, C]

        // Adding an element at a specific position
        temp.add(2, "Python language"); // Inserts "Python language" at index 2
        System.out.println("After inserting an element: " + temp); // [50, true, Python language, 10.56, C]

        // Retrieving an element at a specific index
        System.out.println("Element at index 2: " + temp.get(2)); // Python language

        // Replacing an element at a specific index
        temp.set(2, "C++ language"); // Replaces "Python language" with "C++ language" at index 2
        System.out.println("After replacing an element: " + temp); // [50, true, C++ language, 10.56, C]

        // Checking if an element exists in the ArrayList
        System.out.println("Contains 'C++ language'? " + temp.contains("C++ language")); // true
        System.out.println("Contains 'C# language'? " + temp.contains("C# language"));   // false

        // Checking if the ArrayList is empty
        System.out.println("Is the ArrayList empty? " + temp.isEmpty()); // false

        //-----------------------------------------------------------------------------------
        // Reading elements from the ArrayList using different loops

        // 1) Using a traditional for loop
        System.out.println("Reading elements using a for loop:");
        for (int i = 0; i < temp.size(); i++) {
            System.out.println(temp.get(i));
        }

        // 2) Using a for-each loop
        System.out.println("Reading elements using a for-each loop:");
        for (Object element : temp) {
            System.out.println(element);
        }

        // 3) Using an Iterator
        System.out.println("Reading elements using an Iterator:");
        Iterator iteratorElements = temp.iterator();
        while (iteratorElements.hasNext()) {
            System.out.println(iteratorElements.next());
        }
    }
}
