package com.khoaha;

import java.util.ArrayList;

/**
 * Created by HoangAnhKhoa on 12/30/15.
 */
public class PancakeIterator implements Iterator {

    ArrayList<MenuItem> menuItems;
    int position = 0;

    public PancakeIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.size() && menuItems.get(position) != null;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems.get(position);
        position++;
        return menuItem;
    }
}
