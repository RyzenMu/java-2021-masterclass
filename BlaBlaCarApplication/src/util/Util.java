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
}
