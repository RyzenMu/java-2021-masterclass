public class MethodOverloadingUsingDifferentReturnType {
    // methods cannot be created in the same name
    // method overloading using different return type
    public static int add(int a, int b){
        return a + b;
    }
    public static String add(String a, String b){
        return a + b;
    }

    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";
        System.out.println(add(a, b));
        int c = 8;
        int d = 7;
        System.out.println(add(c,d));
    }

}
