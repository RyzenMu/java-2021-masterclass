public class Scope {
    int i = 6;
    public static void main(String[] args) {
        int i = 5;
        System.out.println(i);

        int j = 1;
        while ( j <= 5){
            j++;
            System.out.println(i);
        }
        method1();
    }
    public static void method1(){
        int i = 7;
        System.out.println(i);
    }
}