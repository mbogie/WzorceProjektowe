package templatemethod;

public class MargharitaPizza extends Pizza{

    public MargharitaPizza(int size) {
        this.size = size;
    }

    public void doCake(){
        System.out.println("ciasto do margharity");
    }

    public void addSauce(){
        System.out.println("sos pomidorowy");
    }

    public void addAdditions(){
        System.out.println("Mozzarella, bazylia, pomidory");
    }

    public void bake(){
        if(size<50)
            System.out.println("15 min w temp 200 stopni");
        else
            System.out.println("30 min w temp 200 stopni");
    }


}
