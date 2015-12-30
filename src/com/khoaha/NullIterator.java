package com.khoaha;

import java.util.Iterator;

/**
 * Created by HoangAnhKhoa on 12/30/15.
 */
public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
