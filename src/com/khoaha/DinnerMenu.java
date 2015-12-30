package com.khoaha;

import java.util.*;
import java.util.Iterator;

/**
 * Created by HoangAnhKhoa on 12/30/15.
 */
public class DinnerMenu implements Menu {
    MenuItem[] menuItems;
    static final int MAX_ITEM = 6;
    public int numberOfItems = 0;

    public DinnerMenu() {
        menuItems = new MenuItem[MAX_ITEM];

        addItem("Vegetarian BLT" , "Vegetarian BLT Desc" , true, 2.99);
        addItem("BLT" , "Bacon with lettuce" , false, 2.79);
        addItem("Soup of the day" , "Soup of the day with potato and salad" , false, 3.29);
        addItem("Hot dog" , "Hot dog with saurkrant, relish, onions, topped with cheese" , false, 3.29);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        if (numberOfItems < MAX_ITEM) {
            menuItems[numberOfItems] = new MenuItem(name, description, vegetarian, price);
            numberOfItems++;
        }else{
            System.out.println("Sorry you can not add more item.");
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator(){
        return new DinnerIterator(menuItems);
    }
}
