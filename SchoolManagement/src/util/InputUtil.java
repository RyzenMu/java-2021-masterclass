package util;

public class InputUtil {
    public static int enternteger(String title){
        System.out.println(title);
        Scanner scanner = new Scanner(System.in);
        int operation = scanner.nextInt();
        return operation;
    }

    public static void main(String[] args) {
        int age = enternteger("How old are you");
        System.out.println(age);
    }
}
