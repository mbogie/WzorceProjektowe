package chainofresponsibility;

public class Main {
    public static void main(String[] args) {

        AbstractLogger console = new ConsoleLogger(AbstractLogger.DEBUG);
        AbstractLogger file = new FileLogger(AbstractLogger.ERROR);
        AbstractLogger remote = new RemoteLogger(AbstractLogger.INFO);

        console.setNextLogger(file);
        file.setNextLogger(remote);

        console.logMessage(AbstractLogger.INFO, "Info message");
        console.logMessage(AbstractLogger.DEBUG, "debug message");
        console.logMessage(AbstractLogger.ERROR, "error message");
    }
}
