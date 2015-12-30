package com.khoaha;

/**
 * Created by HoangAnhKhoa on 12/30/15.
 */
public class PancakeIterator implements Iterator {

    PancakeHouseMenu pancakeHouseMenu;
    int position = 0;

    public PancakeIterator(PancakeHouseMenu pancakeHouseMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
    }

    @Override
    public boolean hasNext() {
        return position < pancakeHouseMenu.getMenuItems().size() && pancakeHouseMenu.getMenuItems().get(position) != null;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = pancakeHouseMenu.getMenuItems().get(position);
        position++;
        return menuItem;
    }
}
