package com.khoaha;

/**
 * Created by HoangAnhKhoa on 12/30/15.
 */
public class DinnerIterator implements Iterator {

    DinnerMenu dinnerMenu;
    int position = 0;

    public DinnerIterator(DinnerMenu dinnerMenu) {
        this.dinnerMenu = dinnerMenu;
    }

    @Override
    public boolean hasNext() {
        return position < DinnerMenu.MAX_ITEM && dinnerMenu.getMenuItems()[position] != null;
    }

    @Override
    public MenuItem next() {

        MenuItem menuItem = dinnerMenu.getMenuItems()[position];
        position++;
        return menuItem;
    }
}
