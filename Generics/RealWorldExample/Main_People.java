import control.ControlClass_People;
import person.People;
import person.Student;
import person.Teacher;

// in this we saw using of two string method
// every classes extend from objects
// real world application using generics

public class Main_People {
    public static void main(String[] args) {
        People people = new People("Bob", "Will");
        ControlClass_People ccp = new ControlClass_People();
        ccp.verify(people);

        Student student = new Student("Mike");
        ccp.verify(student);

        Teacher teacher = new Teacher("Jonson");
        ccp.verify(teacher);

    }
}
