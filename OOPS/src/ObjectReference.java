public class ObjectReference {
    public static void main(String[] args) {
        MilkMan m1 = new MilkMan();
        MilkMan m2 = new MilkMan();
        System.out.println(m1==m2);
        m2=m1;
        System.out.println(m1==m2);
    }
}
