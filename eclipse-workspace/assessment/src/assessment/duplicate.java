package assessment;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

 

public class duplicate {

 

	 public static void main(String[] args) {

	        // Sample array with duplicate elements

	        int[] array = {20,21,22,22,23,24,24,25,26,23,27,28};

 

	        // Remove duplicates using a set

	        int[] resultArray = removeDuplicates(array);

 

	        // Display the array without duplicates

	        System.out.println("Original Array: " + Arrays.toString(array));

	        System.out.println("Array without Duplicates: " + Arrays.toString(resultArray));

	    }

 

	    public static int[] removeDuplicates(int[] array) {

	        // Use a Set to store unique elements

	        Set<Integer> uniqueSet = new HashSet<>();

 

	        // Traverse the array and add each element to the set (sets do not allow duplicates)

	        for (int value : array) {

	            uniqueSet.add(value);

	        }

 

	        // Create a new array to store unique elements

	        int[] resultArray = new int[uniqueSet.size()];

 

	        // Copy unique elements from the set to the new array

	        int index = 0;

	        for (int value : uniqueSet) {

	            resultArray[index++] = value;

	        }

 

	        return resultArray;

	    }

	}