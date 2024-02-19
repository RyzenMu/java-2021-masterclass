package main;

import java.util.Scanner;

import util.Util;
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
        int menu = scanner.nextInt();


        //switch case for selection of services:
        switch(menu){
            case 1:
                String nameSurName = Util.enterString("Enter your name and surname");
                String email = Util.enterString("Enter your email");
                String phoneNumber = Util.enterString("Enter your phone number");
                String location = Util.enterString("Enter your location");
//                System.out.println(nameSurName + email + phoneNumber + location);
                break;
            case 2:
                System.out.println(" offering ride");
                break;
            case 3:
                System.out.println(" About us");
                break;
            case 4:
                System.out.println("You have selected Quit");
                break;
            default:
                System.out.println("Please select something");
        }
    }
}
