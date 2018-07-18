package factorymethod;

public class ToyFactory {

    public enum ToyType{
        LEGO,
        CAR,
        DOLL
    }

    public static Toy createToy(ToyType type){
        switch (type){
            case LEGO:
                return new Lego();
            case CAR:
                return new Car();
            case DOLL:
                return new Doll();
        }
        return null;
    }

}
