package state;

public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("stop state constructor");
        context.setState(this);
    }

    @Override
    public void print() {
        System.out.println("Stop state");
    }
}
