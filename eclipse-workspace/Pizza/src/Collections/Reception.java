package Collections;
import java.util.Scanner;

public class Reception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Bill Number: ");
        int billNo = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter Customer Name: ");
        String custName = scanner.nextLine();

        Bill bill = new Bill(billNo, custName);

        while (true) {
            System.out.print("Enter Pizza Type (or 'quit' to exit): ");
            String pizzaType = scanner.nextLine();
            if (pizzaType.equalsIgnoreCase("quit")) {
                break;
            }

            System.out.print("Enter Pizza Size: ");
            String pizzaSize = scanner.nextLine();

            Pizza pizza = new Pizza(pizzaType, pizzaSize);
            bill.addPizza(pizza);
        }

        bill.calculateTotal();
        System.out.println("Bill created:");
        System.out.println("Bill No: " + bill.getBillNo());
        System.out.println("Customer Name: " + bill.getCustName());
        System.out.println("Bill Date: " + bill.getDate());
        System.out.println("Total Amount: " + bill.getTotal());
        System.out.println("Ordered Pizzas:");
        for (Pizza pizza : bill.getPizza()) {
            System.out.println(pizza);
        }

        scanner.close();
    }
}
