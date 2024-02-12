package main;

import java.util.Scanner;
import util.serviceUtil;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Bla-Bla-Car Application\n\t Your ride and Your Choice");
        String services = "1.Find Ride\n" +
                            "2.Offer Ride\n" +
                            "3.About Us\n" +
                            "0.Quit";
        System.out.println(services);
        int intServices = scanner.nextInt();

        //switch case for selection of services:
        switch(intServices){
            case 1:
                System.out.println("You have selected find ride");
                serviceUtil.util1();
                serviceUtil.util1();
                serviceUtil.util1();
                serviceUtil.util1();

                break;
            case 2:
                System.out.println("You have selected offer ride");
                break;
            case 3:
                System.out.println("You have selected About us");
                break;
            case 4:
                System.out.println("You have selected Quit");
                break;
            default:
                System.out.println("Please select something");
        }
    }
}
