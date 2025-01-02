package Sets.HasSetDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class HasSetConceptPartOne {

    /*
    1) Duplicate are not allowed
    2) Insertion order is not preserved

     */
    public static void main(String[] args) {

//        HashSet flag = new HashSet(); // default capacity 16 and default load Factor is 0.75
//        HashSet flag = new HashSet<>(100);  // Initial capacity is 100
//        HashSet flag = new HashSet(100, 0.90F); // Initial capacity is 100 and Default load factor is 0.90
//        HashSet<Integer> flag = new HashSet<>();  // to store only a single data type variables like integers, Strings

        HashSet flag = new HashSet<>();

        // Add Elements or Objects
        flag.add(5);
        flag.add(0.10);
        flag.add(null);
        flag.add("Hello Chandra");
        flag.add('C');
        flag.add(true);
        // Since insertion order is not preserved so the elements will print in the random order
        // like [null, 0.1, C, 5, Hello Chandra, true] Note: it should be shuffled
        System.out.println("HashSet Elements are : "+ flag);

        // Remove Element from the HashSet. Here we don't have index concept so we have to pass the value of the element
        flag.remove("Hello Chandra");
        System.out.println("HashSet elements after removing of the element : "+flag);       // [null, 0.1, C, 5, true]

        // Contains() will use to searching operations, and it will return true/false
        System.out.println(flag.contains(5));                   //true
        System.out.println(flag.contains("Hello Chandra"));     //false
        System.out.println(flag.isEmpty());                     //false


        //-------------------------------------------------------------------------------


        //1) Traditional for...each loop
        System.out.println("Reading values in HashSet using for..each loop");
        for (Object obj : flag){
            System.out.println(obj);
        }

        //2) Using Iterator
        System.out.println("Reading values in HashSet using Iterator");
        Iterator iterator = flag.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
