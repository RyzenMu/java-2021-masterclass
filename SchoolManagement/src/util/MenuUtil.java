package util;

import main.Configuration;
import main.Student;

public class MenuUtil {
    public static void printAllStudents(){
        if (Configuration.students == null){
            System.out.println("You do not have any student");
            return;
        }
        System.out.println("students that you have registered");
        for (int i = 0; i < Configuration.students.length; i++) {
            Student st = Configuration.students[i];
            System.out.println((1 + i) + "Student \n" + st.getInfo());
        }
    }
    public static void registerStudent(){
        int count = InputUtil.enterString("How many student will you register");
        Configuration.students = new Student[count];
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + "registration");
            Student st = InputUtil.fill();
            Configuration.students[i] = st;
        }
    }
}
