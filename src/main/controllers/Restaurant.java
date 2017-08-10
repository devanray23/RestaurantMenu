package main.controllers;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Restaurant {

    public static void main(String [] args){

        SimpleDateFormat format = new SimpleDateFormat("mm/dd/yyyy");
        Menu RedRobin = new Menu("Red Robin", Calendar.getInstance().getTime());

        Menu iHop = new Menu("iHop", Calendar.getInstance().getTime());

        Menu McDonalds = new Menu("McDonalds", Calendar.getInstance().getTime());

        MenuItem Burger = new MenuItem("BBQ Burger", (float)9.9, "Tasty Burger",
                MenuItem.Type.DINNER, Calendar.getInstance().getTime());

        MenuItem Pancakes = new MenuItem("Buttermilk Pancakes", (float)6.7, "Tasty Pancakes",
                MenuItem.Type.BREAKFAST, Calendar.getInstance().getTime());

        MenuItem Fries = new MenuItem("French Fries", (float)4.9, "Tasty Fries",
                MenuItem.Type.LUNCH, Calendar.getInstance().getTime());

        System.out.println(RedRobin.toString());
        System.out.println(iHop.toString());
        System.out.println(McDonalds.toString());

        System.out.println(Burger.toString());
        System.out.println(Pancakes.toString());
        System.out.println(Fries.toString());

        System.out.println(RedRobin.getLastDateModified());
        System.out.println(iHop.getLastDateModified());
        System.out.println(McDonalds.getLastDateModified());

        RedRobin.addItem(Burger);
        iHop.addItem(Pancakes);
        McDonalds.addItem(Fries);

        System.out.println(RedRobin.toString());
        System.out.println(iHop.toString());
        System.out.println(McDonalds.toString());

        RedRobin.removeItem(Burger);
        iHop.removeItem(Pancakes);
        McDonalds.removeItem(Fries);

        System.out.println(RedRobin.toString());
        System.out.println(iHop.toString());
        System.out.println(McDonalds.toString());
    }

}

