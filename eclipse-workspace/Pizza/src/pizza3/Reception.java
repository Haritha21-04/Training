package pizza3;

import java.util.Date;
import java.util.Scanner;

public class Reception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the order number: ");
        int orderNo = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.print("Enter the order date (in yyyy-mm-dd format): ");
        String orderDateStr = scanner.nextLine();
        Date orderDate = java.sql.Date.valueOf(orderDateStr);

        System.out.print("Enter the cost: ");
        int cost = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.print("Enter customer name: ");
        String custName = scanner.nextLine();

        System.out.print("Enter customer address: ");
        String custAddress = scanner.nextLine();

        System.out.print("Enter approximate distance for delivery: ");
        int approxDistance = scanner.nextInt();

        Order order = new Order(orderNo, orderDate, cost, custName, custAddress, approxDistance);

        if (order.delivery()) {
            System.out.println("Order is deliverable.");
        } else {
            System.out.println("Order is not deliverable.");
        }

        scanner.close();
    }
}
