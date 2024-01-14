
import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
    /*
    * HashMap is non-synchronized.
    * can store null elements but there should be only one null key
    * HashMap<K, V>
    it inherits AbstractMap class and implements Map interface.
    * The set interface inherits collection and iterable interface in hierarchical order.
    * it maintains no order
    * */
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Niece");
        hashMap.put(2, "Berlin");
        hashMap.put(3, "Tokyo");
        hashMap.put(4, "NYC");
        hashMap.put(5, "Niece");
        // get method
        System.out.println(hashMap.get(3));
        System.out.println(hashMap);
        //print using for each
        for(Map.Entry<Integer, String> map : hashMap.entrySet()){
            System.out.println("KEY : " + map.getKey() +" -----" + "Value : " + map.getValue() );
        }
    }
}
