package Assign1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Dubai","America","Turkey","Sydney","Korea","Pakistan","India");

        // Sort in ascending order
        List<String> ascendingSorted = stringList.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Ascending order:");
        ascendingSorted.forEach(System.out::println);

        // Sort in descending order
        List<String> descendingSorted = stringList.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("\nDescending order:");
        descendingSorted.forEach(System.out::println);
    }
}
