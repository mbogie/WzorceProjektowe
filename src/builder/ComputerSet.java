package builder;

public class ComputerSet {

    private String cpu;
    private String motherboard;
    private String ram;
    private String powerSupply;
    private String ssd;
    private String gpu;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public void show(){
        System.out.println(this.getCpu());
        System.out.println(this.getGpu());
        System.out.println(this.getMotherboard());
        System.out.println(this.getPowerSupply());
        System.out.println(this.getRam());
        System.out.println(this.getSsd());
    }
}
