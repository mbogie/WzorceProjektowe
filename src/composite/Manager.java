package composite;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {

    private String name;
    private double salary;
    private List<Employee> employess = new ArrayList<>();

    public Manager(String name, double salary) {
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
        for(Employee e : employess){
            e.riseSalary(rise);
        }
    }

    @Override
    public void print() {
        System.out.println("Employee: "+getName());
        System.out.println("Salaty: "+getSalary());
        for(Employee e : employess){
            System.out.print("-->");
            e.print();
        }
    }

    @Override
    public void add(Employee employee) {
        this.employess.add(employee);
    }

    @Override
    public void remove(Employee employee) {
        this.employess.remove(employee);
    }
}
