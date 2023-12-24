public class BasicMethod {
    public static int mul(int x, int y){
        return x * y;
    }
    int i = 35;

    public static int add(int x, int y){
        return x+y;
    }
    public static void main(String[] args) {
        int i = 86;
        System.out.println(i);
        message();
        System.out.println(add(5, 2));
        System.out.println(mul(5, 2));
    }
    public static void message(){
        System.out.println("This is a message from outer method");
    }
}


