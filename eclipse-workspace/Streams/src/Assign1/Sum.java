package Assign1;

import java.util.Arrays;
import java.util.List;

public class Sum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,15,20,25,30,35,40,45,50);

        
        int sumEven = numbers.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        int sumOdd = numbers.stream()
                .filter(num -> num % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum of Even Numbers: " + sumEven);
        System.out.println("Sum of Odd Numbers: " + sumOdd);
    }
}

