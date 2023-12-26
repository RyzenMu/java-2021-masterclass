public class Main_Cars {
    public static void main(String[] args) {
        Engine engine = new Engine("MMS", 450, "SSH");
        Wheel wheel = new Wheel("Black",20,"Michelin");
        Car car = new Car("Mercedes", 3, 2, engine,wheel);
        System.out.println(car.getName());
        System.out.println(car.getSeats());
        System.out.println(engine.getName());
        System.out.println(wheel.getName());
        System.out.println(car.getEngine());
        System.out.println(car.getWheel());

    }
}
