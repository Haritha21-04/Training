package Assign1;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicates {
    public static void main(String[] args) {
        List<String> stringsWithDuplicates = Arrays.asList("Africa","America","Asia","Africa","India","Afghanistan");

        
        List<String> distinctStrings = stringsWithDuplicates.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Array before Duplicating: " + stringsWithDuplicates);
        System.out.println("Array after Duplicating: " + distinctStrings);
    }
}
