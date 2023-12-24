import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the exam result");
        int result = sc.nextInt();
        switch (result){
            case (10) :
                System.out.println("less tha 10");
                break;
            case (20) :
                System.out.println("less tha 20");
                break;
            case (30) :
                System.out.println("less tha 30");
                break;
            case (40) :
                System.out.println("less tha 40");
                break;
            default:
                System.out.println("Greater than 50");

        }
    }
}
