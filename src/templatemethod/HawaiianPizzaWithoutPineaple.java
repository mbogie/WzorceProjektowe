package templatemethod;

public class HawaiianPizzaWithoutPineaple extends HawaiianPizza {

    public HawaiianPizzaWithoutPineaple(int size) {
        super(size);
    }

    public void addAdditions(){
        System.out.println("szynka, kukurydza i żadnego ananasa!!!");
    }
}
