public class Honda extends Car1{
    // Honda will pretend like a car1 object
    public void run(){
        System.out.println("Honda is working");
    }
    @Override//static method cannot be overeride
    public static void stop(){
        System.out.println("car stopped");
    }
}
