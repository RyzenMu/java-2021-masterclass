import java.util.List;
import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        List<String> list = new java.util.ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        list.add("hey");
        list.add("hello");
        list.add("Come");
        list.add("go");
        for (String i : list){
            System.out.print(i + " ");
        }
        System.out.println();

        // list.get method
        System.out.println(list.get(2));

        // list.size method
        System.out.println("The size of the list is : " + list.size());

        //list.add
        list.add("walk");

        // loop through the list
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }

        //list.remove method
        list.remove(4);
        System.out.println();

        // loop through the list
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // list.indexOf method
        System.out.println("The index of hello is " + list.indexOf("hello"));

        // list accepts duplicate values
        list.add("hey");
        System.out.println("the index of hey is : " + list.indexOf("hey"));

        //list.lastIndexOf method
        System.out.println("The last index of hey is : " + list.lastIndexOf("hey"));

        // list.indexOf method returns -1 if it does not find one
        System.out.println("The index of mac boob is " + list.indexOf("mac book"));

        // list.set method
        list.set(4, "Mac Book");
        System.out.println(list.get(4));
    }
}
