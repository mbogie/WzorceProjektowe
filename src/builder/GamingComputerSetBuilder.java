package builder;

public class GamingComputerSetBuilder extends ComputerSetBuilder {

    @Override
    public void buildCpu() {
        System.out.println("i7 8060k");
    }

    @Override
    public void buildMotherboard() {
        System.out.println("Asus zx370");
    }

    @Override
    public void buildRam() {
        System.out.println("16");
    }

    @Override
    public void buildPowerSupply() {
        System.out.println("nie z czarnej listy na elektrodzie");
    }

    @Override
    public void buildSsd() {
        System.out.println("2tb");
    }

    @Override
    public void buildGpu() {
        System.out.println("nvidia geforce");
    }
}
