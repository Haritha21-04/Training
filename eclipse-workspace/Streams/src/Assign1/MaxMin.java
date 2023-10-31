package Assign1;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxMin {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(25,66,45,76,98,111,34);

        // Find the maximum value using streams
        Optional<Integer> max = integerList.stream()
                .max(Integer::compareTo);

        if (max.isPresent()) {
            System.out.println("Maximum value: " + max.get());
        } else {
            System.out.println("No maximum value found.");
        }

        // Find the minimum value using streams
        Optional<Integer> min = integerList.stream()
                .min(Integer::compareTo);

        if (min.isPresent()) {
            System.out.println("Minimum value: " + min.get());
        } else {
            System.out.println("No minimum value found.");
        }
    }
}

