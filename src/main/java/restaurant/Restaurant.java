package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Restaurant {

    public static void main(String[] args) {
        MenuItem burger = new MenuItem("Burger", "It's a burger", 10.25, "main course", false);
        MenuItem onionRings = new MenuItem("Onion Rings", "Fried and delicious", 5.99, "appetizer", true);
        ArrayList<MenuItem> menuItemList = new ArrayList<>();
        Menu myMenu = new Menu(menuItemList);
        myMenu.addItem(burger);
        myMenu.addItem(onionRings);
        System.out.println(burger.printMenuItem());
        System.out.println(myMenu.printMenu());
        myMenu.removeItem(burger);
        System.out.println(myMenu.printMenu());
    }


}
