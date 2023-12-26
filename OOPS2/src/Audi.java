public class Audi extends Car1{
    // Audi pretends to be like a car1 object.
    public void run() {
        System.out.println("Audi is working");;
    }
    @Override//static method cannot be override
    public static void stop(){
        System.out.println("car stopped");
    }
}
