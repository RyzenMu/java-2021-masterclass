public class MethodOverloadingUsingDifferentParameters {
    public static int method(int a){
        return a;
    }
    public static int method(int a, int b){
        return a+b;
    }
    public static int method(int a, int b, int c){
        return a+b+c;
    }
    public static int method(int a, int b, int d, int c){
        return a+b+d+c;
    }

    public static void main(String[] args) {
        System.out.println(method(1));
        System.out.println(method(1, 1));
        System.out.println(method(1,1,1));
        System.out.println(method(1,1,1,1));

    }
}
