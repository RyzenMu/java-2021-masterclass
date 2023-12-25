public class Example1 {
    public static void main(String[] args) {
        Example1 A1 = new Example1();

        Student s1 = new Student();
        s1.age = 44;
        s1.email = "ssacademy_s1@gmail.com";
        s1.name = "s1";

        Student s2 = new Student();
        s2.age = 24;
        s2.email = "ssacademy_s2@gmail.com";
        s2.name = "s2";
        //private int rollNo is not available outside Student class

        Student.create();
//        Student.create2() is not available - non static
        // to get the create2(), an object must be created
        Student s3 = new Student();
        s3.create2();

    }
}
