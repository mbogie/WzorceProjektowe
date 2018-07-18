package composite;

public interface Employee {

    String getName();
    double getSalary();
    void print();

    void riseSalary(double rise);
    void add(Employee employee);
    void remove(Employee employee);

}
