package decorator;

public class CheeseCake extends Cake{

    public CheeseCake() {
        this.description = "CheeseCake";
    }

    @Override
    public int getPrice() {
        return 20;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
