package state;

public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Start state constructor");
        context.setState(this);
    }

    @Override
    public void print() {
        System.out.println("start state");
    }
}
