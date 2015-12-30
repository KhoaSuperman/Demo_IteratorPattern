package com.khoaha;

public class Main {

    public static void main(String[] args) {
        //Waitress take 3 menus

        MenuComponent pancakeMenu = new Menu("Pancake Menu" , "This is pancake Menu");
        MenuComponent dinnerMenu = new Menu("Dinner Menu" , "This is Dinner");
        MenuComponent cafeMenu = new Menu("Cafe Menu" , "This is Cafe");
        MenuComponent desertMenu = new Menu("Desert Menu" , "This is Desert");

        //add menu type
        MenuComponent allMenus = new Menu("All Menus" , "Here are all Menus");
        allMenus.add(pancakeMenu);
        allMenus.add(dinnerMenu);
        allMenus.add(cafeMenu);
        allMenus.add(desertMenu);

        //add items for each type
        pancakeMenu.add(new MenuItem("K & B's Pancake Breakfast", "Pancake with scambled eggs, and toast" ,true, 2.99));
        pancakeMenu.add(new MenuItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage" ,false, 2.99));

        dinnerMenu.add(new MenuItem("Vegetarian BLT" , "Vegetarian BLT Desc" , true, 2.99));
        dinnerMenu.add(new MenuItem("BLT" , "Bacon with lettuce" , false, 2.79));
        dinnerMenu.add(new MenuItem("Soup of the day" , "Soup of the day with potato and salad" , false, 3.29));
        dinnerMenu.add(new MenuItem("Hot dog" , "Hot dog with saurkrant, relish, onions, topped with cheese" , false, 3.29));

        //Waitress do
        Waitress waitress = new Waitress(allMenus);
        waitress.printVegetarianMenu();
    }
}
