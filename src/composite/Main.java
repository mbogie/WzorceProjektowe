package composite;

public class Main {
    public static void main(String[] args) {

        Employee dev1 = new Developer("Mateusz",15000);
        Employee dev2 = new Developer("Michał", 10000);
        Employee dev3 = new Developer("Jan", 12500);

        Employee manager1 = new Manager("Krzysztof", 5000);
        Employee manager2 = new Manager("Anna", 6000);


        /*dev1.print();
        dev2.print();
        dev3.print();
        manager1.print();
        manager2.print();*/

        manager1.add(dev1);
        manager1.add(dev2);
        manager1.add(dev3);
        manager2.add(manager1);

        manager2.print();

        manager2.riseSalary(1000);
        manager2.print();
    }
}
