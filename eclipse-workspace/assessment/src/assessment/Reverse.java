package assessment;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 4-digit number: ");
        int number = scanner.nextInt();
        
        
        if (number < 1000 || number > 9999) {
           System.out.println("Please enter a valid 4-digit number.");
        } else {
            
            int originalNumber = number;
            int reversedNumber = 0;
            while (number != 0) 
            {
                int digit = number % 10;
                reversedNumber = reversedNumber * 10 + digit;
                number /= 10;
            }
            
            
            if (originalNumber == reversedNumber) {
                System.out.println("The number is a palindrome.");
            } else {
                System.out.println("The number is not a palindrome.");
            }
        }
        
        
        scanner.close();
    }

}