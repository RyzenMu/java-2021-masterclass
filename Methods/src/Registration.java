import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "SS Academy";
        String password = "12345";
        int counter = 0;
        while (counter <=3) {
            counter++;
            System.out.println("Please enter your name");
            String n = sc.nextLine();
            System.out.println("Please enter your password");
            String p = sc.nextLine();
            if (name.equals(n) && password.equals(p)) {
                System.out.println("You are logged in");
                break;
            } else if (!(name.equals(n)) && password.equals(p)) {
                System.out.println("You entered your name wrongly");
            } else if (name.equals(n) && (!(password.equals(p)))) {
                System.out.println("Wrong Password");
            } else {
                System.out.println("You credentials are wrong");
            }
        }
    }
}
