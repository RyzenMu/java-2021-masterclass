import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList2 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Berlin");
        list.add("Paris");
        list.add("USA");
        list.add("UK");
        list.add("Home");
        //iterator
        Iterator<String> iterator = list.listIterator();
        //print list using list iterator
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        // print list
        for(String i : list){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
