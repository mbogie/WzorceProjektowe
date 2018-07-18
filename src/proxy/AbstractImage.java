package proxy;

public abstract class AbstractImage {

    protected String filename;
    protected int size;

    public AbstractImage(String filename, int size) {
        this.filename = filename;
        this.size = size;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public abstract void showFilename();
    public abstract void showSize();
    public abstract void display();
}
