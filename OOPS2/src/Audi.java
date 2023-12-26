public class Audi extends Car1{
    // Audi pretends to be like a car1 object.
    @Override
    public void run() {
        System.out.println("Audi is working");;
    }
    //static method cannot be override
    public static void stop(){
        System.out.println("car stopped");
    }
    public static void stop2(){
        System.out.println("Car Stopped static");
    }
//    @Override - privae mehod canno be overriden
    public void stop3(){
        System.out.println("car stopped, non-static, private method");
    }
}
