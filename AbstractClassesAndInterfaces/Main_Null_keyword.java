public class Main_Null_keyword {
    public static void main(String[] args) {
        String s0 ="ABC";
        String s ="";
        String s1 = null;
        String s2; //undefined
        System.out.println(getUp());
        System.out.println(pushUp());
    }
    public String read(){
        return "a book";
    }
    public static String getUp(){
        return null;
    }
    public static int pushUp(){
        return 0;
    }
}
