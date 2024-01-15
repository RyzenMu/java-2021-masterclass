public class Main_Syn {
    public static void main(String[] args) {
        Sender sender = new Sender();
        SynSend synSend = new SynSend("Hi", sender);
        SynSend synSend2 = new SynSend("Bye", sender);
        synSend.start();
        synSend2.start();
        try {
            synSend.join();
            synSend2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
