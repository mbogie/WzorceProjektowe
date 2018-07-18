package proxy;

public class Image extends AbstractImage{

    public Image(String filename, int size) {
        super(filename, size);
        this.loadFromDisk(filename);
    }

    @Override
    public void showFilename() {

    }

    @Override
    public void showSize() {

    }

    @Override
    public void display() {
        System.out.println("display real file");
    }

    public void loadFromDisk(String filename){
        System.out.println("bardzo ciezka operacja");
        System.out.println("loading from file "+ this.filename);
    }
}
