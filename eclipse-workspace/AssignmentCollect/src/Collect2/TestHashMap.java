package Collect2;

public class TestHashMap {
    public static void main(String[] args) {
        Student student = new Student();

        student.setNames();

        System.out.println("Printing all names:");
        student.printNames();

        System.out.println("\nGetting a name by Roll No:");
        student.getName(2);

        System.out.println("\nPrinting all names using keyset:");
        student.printNamesKeySet();

        System.out.println("\nPrinting the size of the HashMap:");
        student.printSize();

        System.out.println("\nRemoving a name by Roll No:");
        student.remove(3);

        System.out.println("\nPrinting all names after removal:");
        student.printNames();
    }
}
