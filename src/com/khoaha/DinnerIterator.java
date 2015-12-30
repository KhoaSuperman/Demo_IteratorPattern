package com.khoaha;

/**
 * Created by HoangAnhKhoa on 12/30/15.
 */
public class DinnerIterator implements Iterator {

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
}
