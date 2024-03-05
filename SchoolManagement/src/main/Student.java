package main;
import java.lang.String;


public class Student {
    private String name;
    private String surName;
    private int age;
    private String className;
    private int balance = 0;

    public Student() {

    }
    public Student(java.lang.String name, java.lang.String surName, int age, java.lang.String className) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.className = className;
    }
    public Student(java.lang.String name, java.lang.String surName, int age, java.lang.String className, int balance) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.className = className;
        this.balance = balance;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public java.lang.String getClassName() {
        return className;
    }

    public void setClassName(java.lang.String className) {
        this.className = className;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Student{" +
                "name=" + name +
                ", surName=" + surName +
                ", age=" + age +
                ", className=" + className +
                ", balance=" + balance +
                '}';
    }

    public String getInfo(){
        return "name" + getName() +
                "sur name" + getSurName() +
                "age" + getAge() +
                "class name " + getClassName() +
                "balance" + getBalance() +

    }
}
