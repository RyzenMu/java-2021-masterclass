import threads.Employee;

public class CreatingThreadUsingRunnableInterface {
    public static void main(String[] args) {
        Thread employee1 = new Thread(new Employee("Richard"));
        Thread employee2 = new Thread(new Employee("Felix"));
        employee1.start();
        employee2.start();
    }
}
