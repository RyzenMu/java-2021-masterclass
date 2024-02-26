package util;

import java.util.Scanner;

//Site Class
public class Util {
    public static String enterString(String title){
        System.out.println(title);
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        return answer;
    }

    public static int enterInteger(String title){
        System.out.println(title);
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();
        return answer;
    }

    public static String fillUserInfo(){
        String nameSurName = enterString("Enter your name and surname");
        String email = enterString("Enter your email");
        String phoneNumber = enterString("Enter your phone number");
        String location = enterString("Enter your location");
        return "name : " + nameSurName + "\n" + " Email : " + email + "\n"+  "Phone : " + phoneNumber ;
    }

    public static String fillTripInfo(){
        String location = Util.enterString("Your current location");
        int passenger = Util.enterInteger("How many passengers will travel");
        String requires = Util.enterString("Enter requires for example SMOKING: NO"
                +" PET:YES, LUGGAGE: NO");
        return "Your destination from "+ location + " with " +passenger+" passenger "+
                "with these requirements" + requires;
    }
}
