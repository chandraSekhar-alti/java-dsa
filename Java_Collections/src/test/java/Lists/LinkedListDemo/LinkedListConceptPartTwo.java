package Lists;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListConceptPartTwo {

    public static void main(String[] args) {

        LinkedList flag = new LinkedList();

        flag.add("X");
        flag.add("C");
        flag.add("X");
        flag.add("R");
        flag.add("A");
        System.out.println("Flag items are : "+ flag);      // [X, C, X, R, A]

        LinkedList duplicateFLag = new LinkedList<>();
        System.out.println("DuplicateFlag LinkedList before adding Items are : "+duplicateFLag);    // []
        // To add a bunch of elements will use addAll() method
        duplicateFLag.addAll(flag);
        System.out.println("DuplicateFlag LinkedList after adding Items are : "+duplicateFLag);     // [X, C, X, R, A]

        // Remove all items from the LinkedList "removeAll()"
        duplicateFLag.removeAll(flag);
        System.out.println("duplicateFlag items are : "+ duplicateFLag);    // []



        // sort()       Collections.sort(collection)
        System.out.println("Before sorting values are : "+ flag);       // [X, C, X, R, A]
        Collections.sort(flag);
        System.out.println("After sorting values are : "+ flag);        // [A, C, R, X, X]

        // Sorting in reverse order
        Collections.sort(flag,Collections.reverseOrder());
        System.out.println("reverse order elements are  : "+ flag);        // [X, X, R, C, A]

        // shuffling
        Collections.shuffle(flag);
        System.out.println("LinkedList after shuffle : "+ flag);        // randomly align the data like this one [A, X, C, X, R]



    }
}
