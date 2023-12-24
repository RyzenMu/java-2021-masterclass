public class TypeCasting {
    public static void main(String[] args) {

        // Widening type casting will not lose data
        double d = 4.5;
        int e = (int) 4.6;
        System.out.println(e); // Narrowing type casting will lose data

        int f = (int) d;

        double a = 7L ; // Wrapper class

        // explicit casting
        double d1 = 3.8;
        int i1 = (int) d;
        // implicit casting
        int i2 = 8;
        double d2 = i2;
        System.out.println(d2);
    }
}
