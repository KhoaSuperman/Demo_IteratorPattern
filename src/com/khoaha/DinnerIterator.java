package com.khoaha;

import java.util.*;

/**
 * Created by HoangAnhKhoa on 12/30/15.
 */
public class DinnerIterator implements java.util.Iterator {

    MenuItem[] menuItems;
    int position = 0;

    public DinnerIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < DinnerMenu.MAX_ITEM && menuItems[position] != null;
    }

    @Override
    public MenuItem next() {

        MenuItem menuItem = menuItems[position];
        position++;
        return menuItem;
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("You can not remove item until you done at least one next()");
        }

        if (menuItems[position - 1] != null) {
            for (int i = 0; i < menuItems.length - 1; i++) {
                if (i >= position) {
                    menuItems[i] = menuItems[i + 1];
                }
            }
            menuItems[menuItems.length - 1] = null;
        }
    }
}
