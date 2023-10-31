package Assign1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperorLower {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Dubai","America","Turkey","Sydney","Korea","Pakistan","India");

        
        List<String> uppercaseList = stringList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Uppercase Strings:");
        uppercaseList.forEach(System.out::println);

        
        List<String> lowercaseList = stringList.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        System.out.println("\nLowercase Strings:");
        lowercaseList.forEach(System.out::println);
        
        
    }
}

