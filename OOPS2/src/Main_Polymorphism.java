public class Main_Polymorphism {
    //polymorphism means one thing with more functionalities
    public static void main(String[] args) {
        Car1 car1 = new Car1();
        car1.run();
        Car1 car2 = new Audi();
        Car1 car3 = new Mercedes();
        Car1 car4 = new Honda();
//        Audi car5 = new Car1();
        car2.run();
        car3.run();
        car4.run();
        Car1.stop();
    }

}
