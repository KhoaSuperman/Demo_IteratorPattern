package com.khoaha;

import java.util.*;

/**
 * Created by HoangAnhKhoa on 12/30/15.
 */
public class Menu extends MenuComponent {

    ArrayList menuComponents = new ArrayList();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return (MenuComponent) menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.print("\n"+getName());
        System.out.println(", "+getDescription());
        System.out.println("-------------------");

        java.util.Iterator iterator = menuComponents.iterator();
        while(iterator.hasNext()){
            ((MenuComponent) iterator.next()).print();
        }
    }


    public Iterator createIterator(){
        return new CompositeIterator(menuComponents.iterator());
    }
}
