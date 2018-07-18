package builder;

public class HomeComputerBuilder extends ComputerSetBuilder {

    @Override
    public void buildCpu() {
        System.out.println("i3");
    }

    @Override
    public void buildMotherboard() {
        System.out.println("who cares");
    }

    @Override
    public void buildRam() {
        System.out.println("4gb");
    }

    @Override
    public void buildPowerSupply() {
        System.out.println("zasilacz");
    }

    @Override
    public void buildSsd() {
        System.out.println("wystarczy hdd");
    }

    @Override
    public void buildGpu() {
        System.out.println("zintegrowana");
    }
}
