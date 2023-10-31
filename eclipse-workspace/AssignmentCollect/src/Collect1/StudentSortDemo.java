package Collect1;

import java.util.ArrayList;
import java.util.Collections;

public class StudentSortDemo {
    public static void main(String[] args) {
       
        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(new Student(1, "Hari"));
        studentList.add(new Student(2, "Kamal"));
        studentList.add(new Student(3, "Deepthi"));
        studentList.add(new Student(4, "Sunil"));
        studentList.add(new Student(5, "Preethi"));

        System.out.println("Unsorted Student Data:");
        for (Student student : studentList) {
            System.out.println(student);
        }

        Collections.sort(studentList, new NameComparator());

 
        System.out.println("\nSorted Student Data:");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
