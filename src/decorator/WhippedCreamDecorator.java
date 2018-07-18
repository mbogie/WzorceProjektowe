package decorator;

public class WhippedCreamDecorator extends Cake{

    private Cake cake;

    public WhippedCreamDecorator(Cake cake){
        this.cake = cake;
    }

    @Override
    public int getPrice() {
        return cake.getPrice()+6;
    }

    @Override
    public String getDescription() {
        return cake.getDescription()+ " with Cream";
    }
}
