package com.khoaha;

import java.util.Iterator;

/**
 * Created by HoangAnhKhoa on 12/30/15.
 */
public abstract class MenuComponent {
    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException("Not support yet");
    }

    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException("Not support yet");
    }

    public MenuComponent getChild(int i){
        throw new UnsupportedOperationException("Not support yet");
    }

    public String getName(){
        throw new UnsupportedOperationException("Not support yet");
    }

    public String getDescription(){
        throw new UnsupportedOperationException("Not support yet");
    }

    public double getPrice(){
        throw new UnsupportedOperationException("Not support yet");
    }

    public boolean isVegetarian(){
        throw new UnsupportedOperationException("Not support yet");
    }

    public void print(){
        throw new UnsupportedOperationException("Not support yet");
    }

    public Iterator createIterator(){
        throw new UnsupportedOperationException("Not support yet");
    }
}
