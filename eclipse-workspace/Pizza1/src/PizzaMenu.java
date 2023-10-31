import java.util.*;
import java.util.stream.Collectors;

public class PizzaMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> pizzaMenu = new HashMap<>();
        
        // Populate the pizza menu
        pizzaMenu.put("Veg", Arrays.asList("Margherita", "Vegetarian Supreme", "Paneer Tikka"));
        pizzaMenu.put("Non-Veg", Arrays.asList("Pepperoni", "Chicken BBQ", "Meat Lover's"));
        
        while (true) {
            System.out.println("Choose a pizza type: (Veg/Non-Veg/Exit)");
            String pizzaType = scanner.nextLine();
            
            if (pizzaType.equalsIgnoreCase("Exit")) {
                System.out.println("Goodbye!");
                break;
            } else if (pizzaMenu.containsKey(pizzaType)) {
                List<String> pizzas = pizzaMenu.get(pizzaType);
                System.out.println("Available " + pizzaType + " Pizzas:");
                pizzas.forEach(System.out::println);

                System.out.println("Enter the name of the pizza you want to order:");
                String selectedPizza = scanner.nextLine();
                
                List<String> selectedPizzas = pizzas.stream()
                        .filter(pizza -> pizza.equalsIgnoreCase(selectedPizza))
                        .collect(Collectors.toList());
                
                if (!selectedPizzas.isEmpty()) {
                    System.out.println("You have ordered the following " + pizzaType + " pizza(s):");
                    selectedPizzas.forEach(System.out::println);
                } else {
                    System.out.println("Sorry, the selected pizza is not available.");
                }
            } else {
                System.out.println("Invalid pizza type. Please choose Veg, Non-Veg, or Exit.");
            }
        }
        
        scanner.close();
    }
}
