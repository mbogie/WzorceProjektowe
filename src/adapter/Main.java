package adapter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        PersonTemplate person1 = new Person("Jan", "Kowalski", "Prezes", 10000);
        PersonTemplate person2 = new Person("Anna", "Nowakowska", "Sekretarka", 5000);

        OldPerson oldPerson1 = new OldPerson("Tomasz Tomaszewski", "president", 13444);
        OldPerson oldPerson2 = new OldPerson("Krystian Cokolwiek", "secretary", 7777);

        PersonTemplate oldPerson1new = new OldPersonAdapter(oldPerson1);
        PersonTemplate oldPerson2new = new OldPersonAdapter(oldPerson2);

        List<PersonTemplate> personList = new ArrayList<>();

        personList.add(person1);
        personList.add(person2);
        personList.add(oldPerson1new);
        personList.add(oldPerson2new);

        personList.stream().forEach(p -> System.out.println(p.getJobPosition()+" "+p.getSalaryNetto()));
    }
}
