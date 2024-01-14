import java.util.Iterator;
import java.util.Set;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {
    /*
    * Extends HashSet AbstractSet
    * Pretend Linkedlist and HashTable
    * Orderly storage
    * Java LinkedHashSet class contains unique elements only like hashSet.
    *      Java LinkedHashSet class provides all optional set operations and permits null elements.
    *      Java LinkedHashSet class is non synchronized.
    *      Java LinkedHashSet class maintains insertion order.
    * The linkedHashSet class extends HashSet class which implements set interface.
    *The Set interface inherits Collection and Iterable Interface in hierarchical order.
    *
    * */
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //print using for each loop
        for (String s : set){
            System.out.print(s + " ");
        }
    }
}
