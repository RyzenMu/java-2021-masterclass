package util;

import main.Student;

public class InputUtil {
    public static int enternteger(String title){
        System.out.println(title);
        Scanner scanner = new Scanner(System.in);
        int operation = scanner.nextInt();
        return operation;
    }

    public static String enterString(String title) {
        System.out.println(title);
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextLine();
    }

    public static void main(String[] args) {
        int age = enternteger("How old are you");
        System.out.println(age);
    }

    public static student fill(){
        String name = InputUtil.enterString("Enter Student name");
        String surName = InputUtil.enterString("Enter Student surname");
        String email = InputUtil.enterString("Enter Student Email");
        String classname = InputUtil.enterString("enter Student class name");
        int age = InputUtil.enternteger("Enter Student age");
        Student student = new Student(name, surName,age, classname);
        return student
    }
}
