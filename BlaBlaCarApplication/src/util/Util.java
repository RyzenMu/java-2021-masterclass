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

    public static String fillInfo(){
        String nameSurName = enterString("Enter your name and surname");
        String email = enterString("Enter your email");
        String phoneNumber = enterString("Enter your phone number");
        String location = enterString("Enter your location");
        return "name : " + nameSurName + "\n" + " Email : " + email + "\n"+  "Phone : " + phoneNumber ;
    }
}
