package templatemethod;

public abstract class Pizza {

    protected int size;
    public abstract void doCake();
    public abstract void addSauce();
    public abstract void addAdditions();
    public abstract void bake();

    public void prepare(){
        this.doCake();
        this.addSauce();
        this.addAdditions();
        this.bake();
    }
}
