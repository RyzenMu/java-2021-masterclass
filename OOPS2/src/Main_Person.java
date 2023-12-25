public class Main_Person {
    public static void main(String[] args) {
        Student s1 = new Student("Alpha", 22, "Male");
        Teacher t1 = new Teacher("Beta", 55, "Male");
        System.out.println(s1.getName());
        System.out.println(t1.getAge());
        System.out.println(s1.read("Ann"));
        Student.run();
    }
}
