
public class Search {
    public static void main(String[] args) {
        Student student = new Student();
        student.setNames();
        student.searchName("Kamal");//search a name
        student.searchName(2);
        student.printNames();//iterator
        
        student.removeName("Haritha");
        student.printNames();
        }
    }