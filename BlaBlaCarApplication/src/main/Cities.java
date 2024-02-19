package main;

import java.util.LinkedList;

public class Cities {
    // here LinkedList is a non-static ,
    // we need to create an object to access list.
    LinkedList<String> list = new LinkedList<>();
    public Cities(){

    }

    public LinkedList<String> getList(){
        list.add("BERLIN");
        list.add("NIECE");
        list.add("LONDON");
        list.add("PARIS");
        list.add("AMSTERDAM");
        list.add("ROMA");
        return list;
    }

}

