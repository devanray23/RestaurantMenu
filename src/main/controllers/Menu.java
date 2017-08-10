package main.controllers;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Menu {

    private ArrayList<MenuItem> itemsList;
    private String restaurant;
    private Date lastDateModified;

    public Menu(String restaurant, Date lastDateModified){

        this.restaurant = restaurant;
        this.lastDateModified = lastDateModified;

    }

    public void addItem(MenuItem newItem){
        if (!itemsList.contains(newItem)) {
            itemsList.add(newItem);
            this.lastDateModified = Calendar.getInstance().getTime();
        }else{
            System.out.println("Item already exist.");
        }
    }

    public void removeItem(MenuItem oldItem){
        if(itemsList.contains(oldItem)) {
            itemsList.remove(oldItem);
            this.lastDateModified = Calendar.getInstance().getTime();
        }else{
            System.out.println("Item does not exist.");
        }
    }

    public Date getLastDateModified(){ return this.lastDateModified; }

    public String toString(){

        if(this.itemsList.size() == 0){
            return "Menu is empty";
        }

        String wholeMenu = "";

        for (MenuItem item : itemsList){
            wholeMenu += item.toString() + "\n\n";
        }

        return  wholeMenu;
    }



}
