package Assign1;

import java.util.Arrays;
import java.util.List;

public class Second {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(33,65,78,38,60,12,99,90);
        System.out.println("Given Array:" + integerList);
        
		List<Integer> sortedList = integerList.stream()
                .sorted()
                .toList();
		System.out.println("Sorted Array:" + sortedList);
		
		
        if (sortedList.size() >= 2) {
            int secondSmallest = sortedList.get(1);
            System.out.println("Second Smallest Number is: " + secondSmallest);
        } else {
            System.out.println("Not found.");
        }

        
        int listSize = sortedList.size();
        if (listSize >= 2) {
            int secondLargest = sortedList.get(listSize - 2);
            System.out.println("Second Largest Number is: " + secondLargest);
        } else {
            System.out.println("Not found.");
        }
    }
}
