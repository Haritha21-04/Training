package pizza1;

import java.util.Scanner;

public class PizzaHut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option: ");
            System.out.println("1. Italian Pizza");
            System.out.println("2. Mexican Pizza");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Enter pizza type (veg/non-veg): ");
                String type = scanner.next();
                System.out.println("Enter pizza name: ");
                String name = scanner.next();
                System.out.println("Enter toppings: ");
                String toppings = scanner.next();
                System.out.println("Enter time for preparation (in minutes): ");
                float timeForPreparation = scanner.nextFloat();

                ItalianPizza italianPizza = new ItalianPizza(type, toppings, name, timeForPreparation);
                System.out.println(italianPizza.toString());
            } else if (choice == 2) {
                System.out.println("Enter pizza type (veg/non-veg): ");
                String type = scanner.next();
                System.out.println("Enter pizza name: ");
                String name = scanner.next();
                System.out.println("Enter toppings: ");
                String toppings = scanner.next();
                System.out.println("Enter time for preparation (in minutes): ");
                float timeForPreparation = scanner.nextFloat();

                MexicanPizza mexicanPizza = new MexicanPizza(type, toppings, name, timeForPreparation);
                System.out.println(mexicanPizza.toString());
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }
}
