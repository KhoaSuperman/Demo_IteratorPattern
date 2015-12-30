package com.khoaha;

public class Main {

    public static void main(String[] args) {
        //Waitress take 3 menus
        Waitress waitress = new Waitress(new DinnerMenu(), new PancakeHouseMenu(), new CafeMenu());
        waitress.printMenuIterator();
    }
}
