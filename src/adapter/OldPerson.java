package adapter;

public class OldPerson {

    private String name;
    private String position;
    private float salaryBrutto;

    public OldPerson(String name, String position, float salaryBrutto) {
        this.name = name;
        this.position = position;
        this.salaryBrutto = salaryBrutto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getSalaryBrutto() {
        return salaryBrutto;
    }

    public void setSalaryBrutto(float salaryBrutto) {
        this.salaryBrutto = salaryBrutto;
    }
}
