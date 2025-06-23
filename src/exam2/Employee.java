package exam2;

public class Employee
{
    private int id;
    private String name;
    private double salary;


    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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


    public static void main(String[] args) {
        Employee e1=new Employee(123,"dona",3456.78);
        System.out.println(e1.id);
        System.out.println(e1.name);
        System.out.println(e1.salary);
    }
}
