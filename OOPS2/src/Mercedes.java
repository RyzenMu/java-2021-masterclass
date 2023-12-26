public class Mercedes extends Car1{
    //Mercedes will pretend like a Car1 object
    public void run() {
        System.out.println("Mercedes is working");
    }
    @Override//Static method cannot be override
    public static void stop(){
        System.out.println("car stopped");
    }
}
