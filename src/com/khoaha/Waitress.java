package com.khoaha;

import java.util.ArrayList;

/**
 * Created by HoangAnhKhoa on 12/30/15.
 */
public class Waitress {
    DinnerMenu dinnerMenu = new DinnerMenu();
    PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();

    public void printMenu(){
        MenuItem[] dinnerItems = dinnerMenu.getMenuItems();
        System.out.println("Dinner Menu:");
        for (int i = 0; i < dinnerItems.length; i++) {
            MenuItem menuItem = dinnerItems[i];
            System.out.println(menuItem);
        }

        System.out.println("---------------------");

        System.out.println("Pancake Menu:");
        ArrayList<MenuItem> pancakeItems = pancakeHouseMenu.getMenuItems();
        for (int i = 0; i < pancakeItems.size(); i++) {
            MenuItem menuItem = pancakeItems.get(i);
            System.out.println(menuItem);
        }

    }
}
