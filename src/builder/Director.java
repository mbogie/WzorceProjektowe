package builder;

public class Director {

    private ComputerSetBuilder builder;

    public void setBuilder(ComputerSetBuilder builder) {
        this.builder = builder;
    }

    public ComputerSet getComputerSet(){
        return builder.getComputerSet();
    }

    public void build(){
        builder.buildCpu();
        builder.buildMotherboard();
        builder.buildRam();
        builder.buildPowerSupply();
        builder.buildSsd();
        builder.buildGpu();
    }
}
