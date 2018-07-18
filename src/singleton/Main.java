package singleton;
// klasa singleon ustawia tylko jedno stworzenie instancji obiektu
// kazda inna klasa lub metoda odwoluje sie do referencji tej jednej instancji

public class Main {
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        TestSingleton ts = new TestSingleton();

        System.out.println(s1.getGlobalCounter());
        System.out.println(s2.getGlobalCounter());
        System.out.println(s1.getGlobalCounter());
        System.out.println(s2.getGlobalCounter());
        ts.testSingleton();
    }
}
