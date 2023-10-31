package Collect3;


import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        TreeSet<String> productSet = new TreeSet<>();
        productSet.add("Mobile");
        productSet.add("Laptop");
        productSet.add("Bluetooth Headphone");
        productSet.add("Laptop"); // Duplicate
        productSet.add("Keyboard");
        productSet.add("Camera");
        productSet.add("Mouse");

        System.out.println("All product names:");
        Iterator<String> iterator = productSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        {
            System.out.println("\nFirst product: " + productSet.first());
            System.out.println("Last product: " + productSet.last());
        } 
       
        

        
        System.out.println("\nSize of the TreeSet: " + productSet.size());

 
        String productToRemove = "Mouse";
        if (productSet.contains(productToRemove)) {
            productSet.remove(productToRemove);
            System.out.println("\nRemoved product: " + productToRemove);
        } else {
            System.out.println("\nProduct not found: " + productToRemove);
        }

        System.out.println("\nSize of the TreeSet after removal: " + productSet.size());
    }
}
