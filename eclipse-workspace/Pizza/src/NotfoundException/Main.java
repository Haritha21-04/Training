package NotfoundException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws BillNotFoundException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of bills to manage: ");
        int numBills = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        BillReport billReports = new BillReport(numBills);

        while (true) {
            System.out.println("\n1. Enter the Bill Number:");
            System.out.println("2. Search for a Bill Number:");
            System.out.println("3. Exit");
            System.out.print("Enter a Number of your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    Bill bill = new Bill();
                    System.out.print("Enter Bill Number: ");
                    bill.setBillNo(scanner.nextInt());
                    scanner.nextLine();  // Consume the newline character

                    System.out.print("Enter Customer Name: ");
                    bill.setCustName(scanner.nextLine());

                    // Set other bill details...

                    billReports.addBill(bill);
                    System.out.println("Bill added successfully.");
                    break;
                case 2:
                    System.out.print("Enter the Bill Number to search: ");
                    int searchBillNo = scanner.nextInt();
                    scanner.nextLine();  // Consume the newline character

				Bill foundBill = billReports.searchBill(searchBillNo);
				System.out.println("Bill Found - Bill No: " + foundBill.getBillNo());
				// Display other bill details...
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}