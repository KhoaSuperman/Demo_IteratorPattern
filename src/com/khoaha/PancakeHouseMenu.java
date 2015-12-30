package com.khoaha;

import java.util.*;
import java.util.Iterator;

/**
 * Created by HoangAnhKhoa on 12/30/15.
 */
public class PancakeHouseMenu implements Menu{
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        addItem("K & B's Pancake Breakfast", "Pancake with scambled eggs, and toast" ,true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage" ,false, 2.99);
        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries" ,true, 3.49);
        addItem("Waffles", "Waffles, with your choice of blueberries or strawberries" ,true, 3.59);

    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator(){
        return new PancakeIterator(menuItems);
    }
}
