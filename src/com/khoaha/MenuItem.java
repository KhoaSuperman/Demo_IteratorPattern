package com.khoaha;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by HoangAnhKhoa on 12/30/15.
 */
public class MenuItem extends MenuComponent {
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", vegetarian=" + vegetarian +
                ", price=" + price +
                '}';
    }

    @Override
    public void print() {
        System.out.print("  " + getName());
        if (isVegetarian()){
            System.out.print("(v)");
        }
        System.out.println(", Price: " + getPrice());
        System.out.println("  -- " + getDescription());
    }

    public Iterator createIterator(){
        return new NullIterator();
    }
}
