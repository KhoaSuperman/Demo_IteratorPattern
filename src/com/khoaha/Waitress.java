package com.khoaha;

import java.util.ArrayList;

/**
 * Created by HoangAnhKhoa on 12/30/15.
 */
public class Waitress {
    DinnerMenu dinnerMenu;
    PancakeHouseMenu pancakeHouseMenu;

    public Waitress(DinnerMenu dinnerMenu, PancakeHouseMenu pancakeHouseMenu) {
        this.dinnerMenu = dinnerMenu;
        this.pancakeHouseMenu = pancakeHouseMenu;
    }

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

    public void printMenuIterator(){
        System.out.println("Dinner Menu:");
        print(dinnerMenu.createIterator());

        System.out.println("---------------------");

        System.out.println("Pancake Menu:");
        print(pancakeHouseMenu.createIterator());
    }

    public void print(Iterator iterator){
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
