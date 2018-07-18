package chainofresponsibility;

public class RemoteLogger extends AbstractLogger {

    public RemoteLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("remote: "+message);
    }
}
