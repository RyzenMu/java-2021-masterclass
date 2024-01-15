public class SynSend extends Thread {
    private String message;
    Sender sender;
    public SynSend(String message, Sender sender){
        this.message = message;
        this.sender = sender;
    }

    @Override
    public void run() {
        synchronized (sender){
            sender.send(message);
        }

    }
}
