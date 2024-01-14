import java.util.HashSet;
import java.util.Set;

public class HashSetClass {
    /*
    * java hashSet class is used to create collection that uses a hash table for storage
    *         it inherits the AbstractSet class amd implements the Set Interface
    *         HashSet stores the elements by using a mechanism called hashing.
    *         HashSet contains the unique elements only. HashSet allows null value.
    * No guarantee is made as to the iteration order of the set which means that the class does not guarantee.
    * the constant order of elements overtime.\
    * HashSet also implements Serializable and cloneable interface.
    * AS it implements the set interface , duplicate values are not allowed.
    * The underlying data structure for HashSet is HashTable.
    * Hashing Algorithm.
    * Storing randomly.
    * */
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Two");
        set.add("three");
        set.add("One");
        set.add("Five");
        for(String i : set){
            System.out.print(i+" ");
        }
    }
}
