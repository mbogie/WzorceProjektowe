package state;

public class Main {
    public static void main(String[] args) {

    Context context = new Context();

    State startState = new StartState();
    startState.doAction(context);

    context.getState().print();

    State stopState = new StopState();
    stopState.doAction(context);

    context.getState().print();
    }

}
