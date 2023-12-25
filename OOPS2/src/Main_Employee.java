public class Main_Employee {
    public static void main(String[] args) {
        Employee employee = new Employee("Quota", "Girda", 43);
        employee.work();
        Programmer programmer = new Programmer("Cats", "pasf", 46, "C++");
        programmer.work();
        employee.showInfo();
        programmer.showInfo();
        CEO ceo = new CEO("Bob", "Marley", 40, 1700);
        ceo.showInfo();
        ceo.work();


    }
}
