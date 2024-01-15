import threads.Worker;

public class CreatingThread1 {
    public static void main(String[] args) {
        Worker worker = new Worker("Bob");
        worker.start();
        Worker worker1 = new Worker("Mary");
        worker1.start();
    }
}
