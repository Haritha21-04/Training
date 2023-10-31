
import java.util.ArrayList;
import java.util.Iterator;

class Student {
    private ArrayList<String> names = new ArrayList<>();
	public Object empNames;

    public void setNames() {
       
        names.add("Haritha");
        names.add("Deepthi");
        names.add("Kamal");
    }

    public void searchName(String name) {
        if (names.contains(name)) {
            System.out.println(name + " is there in the list.");
        } else {
            System.out.println(name + " is not there in the list.");
        }
    }

    public void searchName(int index) {
        if (index >= 0 && index < names.size()) {
            System.out.println("Student name at index " + index + ": " + names.get(index));
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void printNames() {
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void removeName(String stuName) {
        names.remove(stuName);
    }
}

 


