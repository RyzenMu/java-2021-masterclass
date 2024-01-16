import java.util.Random;
import java.util.Scanner;


public class Main_Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the bulls and cows game");
        System.out.println("This is a logical mind game \n" +
                "B means your guessing number inside the hidden number and in the right place \n" +
                "C means your guessing number is inside the hidden number and in the wrong place");
        Random random = new Random();
        int intRan = random.nextInt(99);  //provides random number within range 1-100
        System.out.println(intRan);
    }
}
