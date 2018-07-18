package decorator;

public class Main {
    public static void main(String[] args) {

        Cake chesse = new CheeseCake();
        Cake chocolate = new ChocolateCake();

        System.out.println(chesse.getDescription()+" "+chesse.getPrice());
        System.out.println(chocolate.getDescription()+" "+chocolate.getPrice());

        Cake icingChesse = new IcingDecorator(chesse);
        System.out.println(icingChesse.getDescription()+" "+icingChesse.getPrice());

        Cake icingWhippedIcingChocolate = new IcingDecorator(new WhippedCreamDecorator
                (new IcingDecorator(chocolate)));
        System.out.println(icingWhippedIcingChocolate.getDescription()+" "
                +icingWhippedIcingChocolate.getPrice());
    }
}
