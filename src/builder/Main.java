package builder;

public class Main {
    public static void main(String[] args) {

        Director director = new Director();

        ComputerSetBuilder gamingBuilder = new GamingComputerSetBuilder();
        ComputerSetBuilder programmingBuilder = new ProgrammingComputerBuilder();
        ComputerSetBuilder homeBuilder = new HomeComputerBuilder();

        director.setBuilder(gamingBuilder);
        director.build();
        ComputerSet gamingSet = director.getComputerSet();
        /*System.out.println("---");

        director.setBuilder(programmingBuilder);
        director.build();
        ComputerSet programmingSet = director.getComputerSet();
        System.out.println("---");

        director.setBuilder(homeBuilder);
        director.build();
        ComputerSet homeSet = director.getComputerSet();
        System.out.println("---");*/



    }
}
