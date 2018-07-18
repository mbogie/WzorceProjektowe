package singleton;

public class Singleton {

    private int globalCounter;

    //private static Singleton instance = new Singleton(); // jedyne wywowalnie konstruktora

    private static Singleton instance = null;

    private Singleton(){        //prywatny konstruktor nie pozwala na swtorzenie instancji
        globalCounter = 0;      //z poza klasy singleton
    }

   /* public static Singleton getInstance() {
        return instance;
    }*/

    public static Singleton getInstance() {
        if(instance==null) instance=new Singleton();
        return instance;
    }

    public int getGlobalCounter(){
        return globalCounter++;
    }

}
