package main;

import java.util.LinkedList;
import java.util.Scanner;

import util.Util;
import util.serviceUtil;
import serviceUtil.Service;

import static java.awt.SystemColor.info;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Bla-Bla-Car Application\n\t Your ride and Your Choice");
        String nationality = Util.enterString("Please tell us are u a foreign or native");

        String services = "1.Find Ride\n" +
                            "2.Offer Ride\n" +
                            "3.About Us\n" +
                            "0.Quit";

        while(true) {


            String information = "";
            if (nationality.equalsIgnoreCase("foreign")) {
                information = Util.enterString("Enter ypur passport ID");
                Thread.sleep(20000);
                System.out.println("Checking passport ID for ..." + information
                        + "\nprocess completed successfully");

            } else if (nationality.equalsIgnoreCase("native")) {

            } else {
                System.out.println("Invalid Operation!!!!");
                continue;
            }
            int menu = scanner.nextInt();
            System.out.println(services);
            //switch case for selection of services:
            switch (menu) {
                case 1:
                    Service.menu1();
                    break;
                case 2:
                    Service.menu2();
                    break;
                case 3:
                    Service.menu3();
                    break;
                case 4:
                    System.out.println("You have selected Quit");
                    System.out.println("Quitting from application");
                    break;
                default:
                    System.out.println("Please select something");
            }
        }
    }
}
