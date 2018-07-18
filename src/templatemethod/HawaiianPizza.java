package templatemethod;

public class HawaiianPizza extends Pizza{

    public HawaiianPizza(int size) {
        this.size = size;
    }

    public void doCake(){
        System.out.println("ciasto hawajskie");
    }

    public void addSauce(){
        System.out.println("sos czosnkowy");
    }

    public void addAdditions(){
        System.out.println("szynka, ananas, kukurydza");
    }

    public void bake(){
        if(size<30)
            System.out.println("23 minuty w temp 180 stopni");
        else
            System.out.println("47 minut w temp 180 stopni");
    }

}
