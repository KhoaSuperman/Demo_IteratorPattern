package com.khoaha;

import java.util.*;

/**
 * Created by HoangAnhKhoa on 12/30/15.
 */
public class Waitress {

    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void print(){
        allMenus.print();
    }

    public void printVegetarianMenu(){
        Iterator iterator = allMenus.createIterator();
        System.out.println("---\nVegetarian Menu\n---");
        while(iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            try{
                if(menuComponent.isVegetarian()){
                    menuComponent.print();
                }
            }catch(UnsupportedOperationException e){}
        }
    }
}
