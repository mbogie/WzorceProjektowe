package proxy;

public class Main {
    public static void main(String[] args) {

        AbstractImage image = new ProxyImage("nazwa pliku", 1024);

        image.showFilename();
        image.showSize();
        image.display();
        image.display();

        AbstractImage image2 = new ProxyImage("inna nazwa", 2048);
        image2.display();
    }
}
