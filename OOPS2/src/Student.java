public class Student extends Person{
    public Student(String name, int age, String sex){
        super(name,age, sex);
    }
    public static void run(){
        System.out.println("Student is running");
    }
    public String read(String bookName){
        return bookName;
    }
}
