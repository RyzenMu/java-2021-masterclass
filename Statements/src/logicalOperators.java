import java.util.Scanner;

public class logicalOperators {
    public static void main(String[] args) {
        /*
        * && - and
        * || - or
        * != - not
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        if (number!=0){
            System.out.println("you have entered a number");
        }
        if (number<40){
            System.out.println("Fail");
        } else if (number == 40 ) {
            System.out.println("Just Passed");
        }
        else {
            System.out.println("Passed");
        }
    }
}
