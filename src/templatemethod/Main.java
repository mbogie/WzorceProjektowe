package templatemethod;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Pizza margharita = new MargharitaPizza(30);
        Pizza hawaiian = new HawaiianPizza(50);
        Pizza funghi = new FunghiPizza(56);
        Pizza betterHawaiian = new HawaiianPizzaWithoutPineaple(20);

        List<Pizza> pizzaList = new ArrayList<>();

        pizzaList.add(margharita);
        pizzaList.add(hawaiian);
        pizzaList.add(funghi);
        pizzaList.add(betterHawaiian);

        pizzaList.stream().forEach(pizza -> {
            pizza.prepare();
            System.out.println("---");
        });

    }
}
