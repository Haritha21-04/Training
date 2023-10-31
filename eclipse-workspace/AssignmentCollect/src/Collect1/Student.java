package Collect1;

import java.util.Comparator;
class Student {
    private int rollNo;
    private String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name;
    }
}

class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return student1.getName().compareTo(student2.getName());
    }
}

