package Collect2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Student {
    private HashMap<Integer, String> empNames;

    public Student() {
        empNames = new HashMap<>();
    }

    public void setNames() {
        empNames.put(1, "Haritha");
        empNames.put(2, "Deepthi");
        empNames.put(3, "Preethi");
        empNames.put(4, "Sanghami");
        empNames.put(5, "Durga");
    }

    public void printNames() {
        for (Map.Entry<Integer, String> entry : empNames.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }

    public void getName(int key) {
        String name = empNames.get(key);
        if (name != null) {
            System.out.println("Name for Roll No " + key + ": " + name);
        } else {
            System.out.println("Roll No " + key + " not found.");
        }
    }

    public void printNamesKeySet() {
        Set<Integer> keys = empNames.keySet();
        for (int key : keys) {
            System.out.println("Name for Roll No " + key + ": " + empNames.get(key));
        }
    }

    public void printSize() {
        System.out.println("Size of HashMap: " + empNames.size());
    }

    public void remove(int key) {
        String removedName = empNames.remove(key);
        if (removedName != null) {
            System.out.println("Removed name for Roll No " + key + ": " + removedName);
        } else {
            System.out.println("Roll No " + key + " not found. Nothing to remove.");
        }
    }
}

