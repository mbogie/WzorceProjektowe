package templatemethod;

public class FunghiPizza extends Pizza {

    public FunghiPizza(int size) {
        this.size = size;
    }

    @Override
    public void doCake() {
        System.out.println("grube amerykanskie ciasto");
    }

    @Override
    public void addSauce() {
        System.out.println("sos koperkowy");
    }

    @Override
    public void addAdditions() {
        System.out.println("grzyby, kiełbasa");
    }

    @Override
    public void bake() {
        System.out.println("piec przez "+this.size*10+" minut");
    }

}
