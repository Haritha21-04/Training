package com.yourpackage;

public class RestaurantApp {
    public static void main(String[] args) {
        MenuCard[] menus = new MenuCard[5];

        menus[0] = new MenuCard("Stamppot boerenkool", 564.65, 45, 20.5, 0.5);
        menus[1] = new MenuCard("Metworst", 345, 12, 10.99, 0);
        menus[2] = new MenuCard("Hutspot", 560.4, 65, 30.9, 1);
        menus[3] = new MenuCard("Biefstuk", 780, 46, 50.34, 2);
        menus[4] = new MenuCard("Kibbeling", 450.4, 23, 20.78, 1);

        // Print menu details
        for (MenuCard menu : menus) {
            menu.printMenuDetails();
        }

        // Print dishes with cooking time < 30
        for (MenuCard menu : menus) {
            if (menu.getCookingTime() == 12) {
                System.out.println(menu.getName() + " cooks in " + menu.getCookingTime());
            }
        }

        // Calculate and print total price
        double totalPrice = 0;
        for (MenuCard menu : menus) {
            totalPrice += menu.getPricePerPerson();
        }

        System.out.println("The total price is: " + totalPrice);

        // Check for a discount and print discounted price if applicable
        if (totalPrice > 65) {
            double discountedPrice = totalPrice * 0.9; // Apply a 10% discount
            System.out.println("The discounted price is: " + discountedPrice);
        }
    }
}
