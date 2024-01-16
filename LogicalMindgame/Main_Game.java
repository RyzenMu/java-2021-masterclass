import java.util.Random;
import java.util.Scanner;


public class Main_Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            //information about the game
            System.out.println("Welcome to the bulls and cows game");
            System.out.println("This is a logical mind game \n" +
                    "B means your guessing number inside the hidden number and in the right place \n" +
                    "C means your guessing number is inside the hidden number and in the wrong place");


            // getting random number
            Random random = new Random();
            int intRan = random.nextInt(99);  //provides random number within range 1-100
            System.out.println("This is a Integer value " + intRan);

            //produce 2 digit random number
            while (intRan < 11){
                intRan++;
            }


            //convert integer to string
            String svo = String.valueOf(intRan);
            System.out.println("I converted integer to string " + svo);
            System.out.println(svo.getClass());


            //getting index 0 and index 1 of the string using charAt() string  method
            char char0 = svo.charAt(0);
            char char1 = svo.charAt(1);
            System.out.println("The char at 0 position is : " + char0);
            System.out.println("The char at 1 position is : " + char1);

        while(true){
            // if two digits are same
            if (char0 == char1){
                char1++;
            }
            //getting user input
            String userInput = scanner.nextLine();
            System.out.println("the user input is : " + userInput);
            System.out.println("The tupe of user input is : " + userInput.getClass());
            if (userInput.length()<2){
                System.out.println(" You entered single digit number");
                continue;
            }

            //splitting user input into char0 and char1
            char userChar0 = userInput.charAt(0);
            char userChar1 = userInput.charAt(1);
            System.out.println(userChar0 + "    " + userChar1);

            //converting user input string to integer
            Integer userInputI = Integer.parseInt(userInput);
            System.out.println("The type of user input converted is : " + userInputI.getClass());

            //checking conditions

            if (userInputI == intRan) {
                System.out.println("congratulations");
                return;
            }
//        if (char0 == userChar0 && char1==userChar1){
//            System.out.println("congratulations");
//        }
            else if (userChar1 == char1 || userChar0 == char0) {
                System.out.println(" 1B 0C ");
//                break;
            } else if (userChar1 == char0 && userChar0 == char1) {
                System.out.println(" 0B 2C ");
//                break;
            } else if (userChar1 == char0 || userChar0 == char1) {
                System.out.println(" 0B 1C ");
//                break;
            } else {
                System.out.println(" 0B 0C ");
//                break;
            }
        }
    }
}
