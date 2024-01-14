import java.util.Arrays;
import java.util.Scanner;

public class InputStringArray {
    public static void main(String[] args) {
        String [] s = new String[4];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements of array");
        for(int i=0; i<4; i++){
            s[i] = scanner.nextLine();
        }
        for(String h : s){
            System.out.print(h + "    ");
        }
        System.out.println();
        String [] s2 = new String[4];
        System.out.println("Enter elements of array - 2");
        for (int i = 0; i< s2.length; i++){
            s2[i] = scanner.nextLine();

        }
        for(String j : s2){
            System.out.print(j + "  ");
        }
        System.out.println();
        // compare 2 Arrays
        System.out.println(Arrays.equals(s2, s));
    }
}
