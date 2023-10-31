package Collect;

import java.util.ArrayList;
import java.util.Collections;

public class StudentSortDemo {
    public static void main(String[] args) {
       
        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(new Student(1, "Haritha"));
        studentList.add(new Student(2, "Deepthi"));
        studentList.add(new Student(3, "Kamal"));
        studentList.add(new Student(4, "Preethi"));
        studentList.add(new Student(5, "Sunil"));

       
        System.out.println("Unsorted Student Data:");
        for (Student student : studentList) {
            System.out.println(student);
        }

       
        Collections.sort(studentList);

       
        System.out.println("\nSorted Student Data:");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
