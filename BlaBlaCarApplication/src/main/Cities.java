package main;

import java.util.LinkedList;

public class Cities {

    LinkedList<String> list = new LinkedList<>();
    public Cities(){

    }

    public LinkedList<String> getList(){
        list.add("Berlin");
        list.add("Niece");
        list.add("London");
        list.add("Paris");
        list.add("Amsterdam");
        list.add("Roma");
        return list;
    }

}

