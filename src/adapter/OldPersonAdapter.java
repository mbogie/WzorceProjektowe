package adapter;

public class OldPersonAdapter extends PersonTemplate {

    public OldPersonAdapter(OldPerson oldPerson) {
        String[] nameParts = oldPerson.getName().split(" ");
        this.setName(nameParts[0]);
        this.setSurname(nameParts[1]);
        this.setSalaryNetto(oldPerson.getSalaryBrutto()*0.77f);

        if(oldPerson.getPosition().equals("president")){
            this.setJobPosition("Prezes");
        } else if(oldPerson.getPosition().equals("secretary")){
            this.setJobPosition("Sekretarka");
        } else this.setJobPosition("niezatrudniony");

    }
}
