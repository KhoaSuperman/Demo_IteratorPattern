package com.khoaha;

import java.util.*;
import java.util.Iterator;

/**
 * Created by HoangAnhKhoa on 12/30/15.
 */
public class CafeMenu implements Menu {

    Hashtable menuItems = new Hashtable();

    public CafeMenu() {
        addItem("Veggie Burger and Air Fries" , "Veggie burger on whole wheat bun, lettuce, tomato, and fries", true, 3.39);
        addItem("Soup of the day" , "A cup of the soup of the day, with a side salad", false, 3.69);
        addItem("Burrito" , "A large burrito, with whole pinto beans, salsa, quacamole", true, 4.29);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(name, menuItem);
    }

    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
