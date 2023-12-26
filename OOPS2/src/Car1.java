public class Car1 {
    public void run(){
        System.out.println("car is working");
    }
    public static void stop(){
        System.out.println("car stopped");
    }
    private static void stop2(){
        System.out.println("Car Stopped static");
    }
    private void stop3(){
        System.out.println("car stopped, non-static, private method");
    }
}
