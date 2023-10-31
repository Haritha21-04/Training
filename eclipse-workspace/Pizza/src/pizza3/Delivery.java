package pizza3;
import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Italian Pizza Delivery!");
        System.out.print("Enter the type (Veg/Non-Veg): ");
        String type = scanner.nextLine();

        System.out.print("Enter the size (small/medium): ");
        String size = scanner.nextLine();

        System.out.print("Do you want to add toppings? (yes/no): ");
        String addToppings = scanner.nextLine();
        int additionalCost = addToppings.equalsIgnoreCase("yes") ? 30 : 0;

        ItalianPizza pizza = new ItalianPizza(type, "Italian", "Deluxe", 20.0f, 0, size);
        int totalCost = pizza.calculateCost() + additionalCost;

        System.out.println(pizza);
        System.out.println("Total Cost: $" + totalCost);

        scanner.close();
    }
}
