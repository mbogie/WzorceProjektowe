package singleton;

public class TestSingleton {

    public void testSingleton(){
        Singleton t1 = Singleton.getInstance();
        System.out.println(t1.getGlobalCounter());
    }
}
