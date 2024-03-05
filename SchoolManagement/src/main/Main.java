package main;

import util.InputUtil;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to School Operation center");
        int operation = InputUtil.enternteger("what do you want to do\n" +
                "\n1.Register Student" +
                "\n2.Show all Student" +
                "\n3.Find Student" +
                "\n4.Update Student" +
                "\n0.Quit");
//        Scanner scanner = new Scanner(System.in);
//        int operation = scanner.nextInt();
        if (operation == 1) {
            System.out.println("You choose operation 1 and you can register " +
                    "student");
        }
    }
}
