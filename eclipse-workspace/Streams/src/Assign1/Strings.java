package Assign1;

import java.util.Arrays;
import java.util.List;

public class Strings {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Asia","Africa","Australia","Sydney","Japan","Korea");

        char targetLetter = 'A'; 

        long count = stringList.stream()
                .filter(str -> str.startsWith(String.valueOf(targetLetter)))
                .count();

        System.out.println("Number of strings starting with '" + targetLetter + "': " + count);
    }
}
