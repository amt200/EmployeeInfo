package sg.edu.rp.c346.employeeinfo;

public class Employee {
    private String title;
    private String name;
    private double salary;

    public Employee(String title, String name, double salary) {
        this.title = title;
        this.name = name;
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "title='" + title + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
