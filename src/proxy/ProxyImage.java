package proxy;

public class ProxyImage extends AbstractImage {

    private Image realImage;

    public ProxyImage(String filename, int size) {
        super(filename, size);
    }

    @Override
    public void showFilename() {
        System.out.println("nazwa "+filename);
    }

    @Override
    public void showSize() {
        System.out.println("rozmiar "+size);
    }

    @Override
    public void display() {
        if(realImage==null) realImage = new Image(filename,size);
        realImage.display();
    }
}
