package decorator;

public class IcingDecorator extends Cake{

    private Cake cake;

    public IcingDecorator(Cake cake){
        this.cake = cake;
    }

    @Override
    public int getPrice() {
        return cake.getPrice()+4;
    }

    @Override
    public String getDescription() {
        return cake.getDescription()+" with Icing";
    }
}
