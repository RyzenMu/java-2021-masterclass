package main;

import java.util.LinkedList;
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
                System.out.println("Welcome.........");
                String city = Util.enterString("Where do you wnat to go");
                String toUpperCity = city.toUpperCase();
                System.out.println("Checking Destinations for :" + toUpperCity);
                Cities cities = new Cities();
                LinkedList<String> list = cities.getList();
                if (list.contains(toUpperCity)) {
                    System.out.println("There are available trips for " +
                                    toUpperCity + "....");

                }else {
                    System.out.println("There are no available trips..\t here are the active trips");
                    for (String i : list){
                        System.out.println(i);
                    }
                }
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
