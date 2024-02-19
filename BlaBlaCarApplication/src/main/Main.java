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
                String info = Util.fillInfo();
                System.out.println(info);
                break;
            case 2:
                info = Util.fillInfo();
                System.out.println(info);
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
