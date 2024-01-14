package person;
import java.lang.String;

public class People {
    String name;
    String surName;
    public People(){

    }

    public People(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getSurName() {
        return surName;
    }

    public void setSurName(java.lang.String surName) {
        this.surName = surName;
    }

    @Override
    public String toString() {
        return "name : " + name + "Surname :" + surName;
    }

}
