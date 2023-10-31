package assessment;
import java.util.Scanner;
public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            System.out.print("Basic Salary: ");
            double basic = scanner.nextDouble();
            System.out.print("HRA: ");
            double hra = scanner.nextDouble();
            System.out.print("DA: ");
            double da = scanner.nextDouble();
            System.out.print("Special Allowance: ");
            double specialAllowance = scanner.nextDouble();
            scanner.nextLine(); 

            employees[i] = new Employee(name, age, 0); 
            employees[i].calculateSalary(basic, hra, da, specialAllowance);
        }

        System.out.println("Employee Details:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            employees[i].displayDetails();
        }

        scanner.close();
    }
}