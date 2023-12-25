public class Driver extends Employee{
    private int cars;
    public Driver(String name, String surname, int age, int cars) {
        super(name, surname, age);
        this.cars = cars;
    }

    @Override
    public void work() {
        super.work();
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("The number of cars" + cars);
    }
}
