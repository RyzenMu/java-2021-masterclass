public class AnanynousInnerClass {
    public class A {

    }

    public static void main(String[] args) {
        B b = new B() {
            @Override
            public String sayName() {
                return null;
            }

            @Override
            public int increment() {
                return 0;
            }

            @Override
            public double doDecimal() {
                return 0;
            }
        };
    }
    interface B{
        String sayName();
        int increment();
        double doDecimal();
    }
}
