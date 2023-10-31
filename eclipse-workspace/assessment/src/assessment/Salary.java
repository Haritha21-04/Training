package assessment;
import java.util.Scanner;
public class Salary {
    
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the basic salary of the employee: ");
        double basicSalary = scanner.nextDouble();
        double hraPercentage = 0.0;
        double daPercentage = 0.0;
        
        if (basicSalary >= 1 && basicSalary <= 4000) 
        {
            hraPercentage = 0.10;daPercentage = 0.50;
        } 
        else if (basicSalary > 4000 && basicSalary <= 8000) 
        {
            hraPercentage = 0.20;daPercentage = 0.60;
        } else if (basicSalary > 8000 && basicSalary <= 12000) 
        {
            hraPercentage = 0.25;daPercentage = 0.70;
        } else if (basicSalary > 12000) 
        {
            hraPercentage = 0.30;daPercentage = 0.80;
        } 
        
        double hra = basicSalary * hraPercentage;
        double da = basicSalary * daPercentage;
        double grossSalary = basicSalary + hra + da;
        
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + grossSalary);
        
        scanner.close();
    }
}
