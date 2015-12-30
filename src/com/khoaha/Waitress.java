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
}
