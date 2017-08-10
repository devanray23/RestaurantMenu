package main.controllers;

import java.util.Calendar;
import java.util.Date;

public class MenuItem {

    private String name;
    private Float price;
    private String description;
    public enum Type
    {
        BREAKFAST, LUNCH, DINNER
    };

    private Type Category;

    private Date dateAdded;

    public MenuItem(String name, Float price, String description, Type category, Date dateAdded){
        this.name = name;
        this.price = price;
        this.description = description;
        this.Category = category;
        this.dateAdded = dateAdded;
    }

    public String toString(){
        String item = "";

        if(this.isNew()){
            item += "*** NEW ***";
        }

        item += "Name: " + this.name + "\n" +
                "Price: " + this.price + "\n" +
                "Description: " + this.description + "\n" +
                "Category: " + this.Category + "\n" +
                "Date Added: " + this.dateAdded;

        return item;
    }

    public Boolean isNew(){

        Date today = Calendar.getInstance().getTime();
        return today.compareTo(this.dateAdded) > 30;
    }

    public Boolean compareItems(MenuItem X){
        return this == X;
    }


}
