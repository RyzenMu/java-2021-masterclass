public class Main_Employee {
    public static void main(String[] args) {
        Employee e1 = new Employee("Quota", "Girda", 43);
        e1.work();
        Programmer p1 = new Programmer("Cats", "pasf", 46, "C++");
        p1.work();
        e1.showInfo();
        p1.showInfo();


    }
}
