package threads;

public class Employee implements Runnable{
    String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " is working");
        for(int i = 0; i<10; i++){
            System.out.println(name + " is writing " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
