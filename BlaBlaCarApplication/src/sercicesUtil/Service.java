package serviceUtil;

import main.Cities;
import util.Util;

import java.util.LinkedList;

public class Service {
    public static void menu1(){
        String info = Util.fillUserInfo();
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
            String tripInfo = Util.fillTripInfo();
            System.out.println(tripInfo);

        }else {
            System.out.println("There are no available trips..\t here are the active trips");
            for (String i : list){
                System.out.println(i);
            }
        }
    }

    public static void menu2(){
        String info = Util.fillUserInfo();
        System.out.println(info);
        String carType = Util.enterString("Please enter your car type ");
        String placeTo = Util.enterString("Where do you ride");
        String placeFrom = Util.enterString("Your current location");
        int capacity = Util.enterInteger("How many passengers you can carry");
        String requires = Util.enterString("\"Enter requires for example SMOKING: NO\"\n" +
                "                +\" PET:YES, LUGGAGE: NO\"");
        System.out.println("Car type "+ carType + " from " + placeFrom+ " to "
                + placeTo+ " With " + capacity + " passengers and with\n" +
                "these requirements" + requires);
    }
}
