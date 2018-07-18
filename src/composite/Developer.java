package composite;

public class Developer implements Employee {

    private String name;
    private double salary;

    public Developer(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public void riseSalary(double rise) {
        this.salary+=rise;
    }

    @Override
    public void print() {
        System.out.println("Employee: "+getName());
        System.out.println("Salaty: "+getSalary());
    }

    @Override
    public void add(Employee employee) {

    }

    @Override
    public void remove(Employee employee) {

    }
}
