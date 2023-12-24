import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        if (number <10) {
            System.out.println("The number is less than 10");
        }
        else if (number > 10 && number < 20) {
            System.out.println("The number is between 10 and 20");
        }
        else{
            System.out.println("the number is greater than 20");
        }
    }
}
