package builder;

public class ProgrammingComputerBuilder extends ComputerSetBuilder{

    @Override
    public void buildCpu() {
        System.out.println("i9");
    }

    @Override
    public void buildMotherboard() {
        System.out.println("tez jakas mocna");
    }

    @Override
    public void buildRam() {
        System.out.println("8gb");
    }

    @Override
    public void buildPowerSupply() {
        System.out.println("no zasilacz");
    }

    @Override
    public void buildSsd() {
        System.out.println("256 bo wszystko w chmurze");
    }

    @Override
    public void buildGpu() {
        System.out.println("radeon");
    }
}
