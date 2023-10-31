package Assign1;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Average {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(10,20,30,40,50,60);

        
        OptionalDouble average = integerList.stream()
                .mapToDouble(Integer::doubleValue)
                .average();

        if (average.isPresent()) {
            double avgValue = average.getAsDouble();
            System.out.println("Average of all the Numbers: " + avgValue);
        } else {
            System.out.println("No average found.");
        }
    }
}

