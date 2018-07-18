package decorator;

public abstract class Cake {

    protected String description;

    public abstract int getPrice();
    public abstract String getDescription();

    public void setDescription(String description) {
        this.description = description;
    }



}
