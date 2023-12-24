import java.util.Scanner;

public class ScannerClassGettingUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = sc.nextInt();
        System.out.println("our user entered this number : " + a);
        int b = sc.nextInt();
        System.out.println("our second number is :  " + b);
        int c = a + b;
        System.out.println("The total is : " + (c+a+b-a-b));
        String name = sc.next();
        System.out.println("Your name is : " + name);

    }
}
