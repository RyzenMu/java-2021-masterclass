public class UsingThis {
    public static void main(String[] args) {
        PhoneConstructor sam = new PhoneConstructor(6,"A03S", "Black");
        PhoneConstructor nok = new PhoneConstructor(3, "N95", "White");
        sam.print();
        nok.print();
    }
}
