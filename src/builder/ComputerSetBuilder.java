package builder;

public abstract class ComputerSetBuilder {

    protected ComputerSet computerSet;

    public void newComputerSet(){
        computerSet = new ComputerSet();
    }

    public ComputerSet getComputerSet() {
        return this.computerSet;
    }

    public abstract void buildCpu();
    public abstract void buildMotherboard();
    public abstract void buildRam();
    public abstract void buildPowerSupply();
    public abstract void buildSsd();
    public abstract void buildGpu();

}
