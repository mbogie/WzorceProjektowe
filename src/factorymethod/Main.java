package factorymethod;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Toy lego = ToyFactory.createToy(ToyFactory.ToyType.LEGO);
        Toy car = ToyFactory.createToy(ToyFactory.ToyType.CAR);
        Toy doll = ToyFactory.createToy(ToyFactory.ToyType.DOLL);

        List<Toy>toyList = new ArrayList<>();

        toyList.add(lego);
        toyList.add(car);
        toyList.add(doll);

        toyList.stream().forEach(toy -> toy.print());
    }
}
