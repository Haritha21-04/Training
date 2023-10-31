package assessment;

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void calculateSalary(double basic, double hra, double da, double specialAllowance) {
        salary = basic + hra + da + specialAllowance;
    }

    public void calculateSalary(double basic, double hra, double da) {
        calculateSalary(basic, hra, da, 0); 
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
        System.out.println("Employee Salary: " + salary);
    }
}

