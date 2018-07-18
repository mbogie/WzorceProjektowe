package adapter;

public abstract class PersonTemplate {

    protected String name;
    protected String surname;
    protected String jobPosition;
    protected float salaryNetto;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public float getSalaryNetto() {
        return salaryNetto;
    }

    public void setSalaryNetto(float salaryNetto) {
        this.salaryNetto = salaryNetto;
    }

    public void showPerson(){
        System.out.println("-------------");
        System.out.println("Pracownik: "+this.getName()+" "+this.getSurname());
        System.out.println("Stanowisko: "+this.getJobPosition());
        System.out.println("Uposażenie netto: "+this.getSalaryNetto());
        System.out.println("-------------");
    }

}
