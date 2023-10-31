package pizza1;
import java.util.Scanner;

public class Pizza1 {
    public static void main(String[] args) {
        CustomerReport report = new CustomerReport(5);
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            Customer customer = new Customer();
            System.out.println("Enter details for customer " + (i + 1) + ":");
            System.out.print("Customer Number: ");
            customer.setCustNo(scanner.nextInt());
            scanner.nextLine(); 
            System.out.print("Customer Name: ");
            customer.setCustName(scanner.nextLine());
            System.out.print("Customer Address: ");
            customer.setCustAddr(scanner.nextLine());
            report.addCustomer(customer);
        }
        report.printList();
    }
}