package strategy;

public class Main {
    public static void main(String[] args) {

        Strategy add = new OperationAdd();
        Strategy multipy = new OperationMultiply();
        Strategy substract = new OperationSubstract();

        Context context = new Context(add);
        System.out.println(context.executeStrategy(234,478));

        context.setStrategy(multipy);
        System.out.println(context.executeStrategy(234,478));

        context.setStrategy(substract);
        System.out.println(context.executeStrategy(234,478));
    }

}
