package decorator;

public class ChocolateCake extends Cake{

    public ChocolateCake(){
        this.description = "chocolate cake";
    }

    @Override
    public int getPrice() {
        return 30;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
