import Builders.*;

public class Main {
    public static void main(String[] args) {
        // Build a Gaming Computer
        ComputerBuilder gamingBuilder = new GamingComputerBuilder();
        ComputerDirector gamingDirector = new ComputerDirector(gamingBuilder);
        gamingDirector.constructComputer();
        Computer gamingComputer = gamingDirector.getComputer();
        System.out.println(gamingComputer);

        System.out.println("\n====================\n");

        // Build an Office Computer
        ComputerBuilder officeBuilder = new OfficeComputerBuilder();
        ComputerDirector officeDirector = new ComputerDirector(officeBuilder);
        officeDirector.constructComputer();
        Computer officeComputer = officeDirector.getComputer();
        System.out.println(officeComputer);
    }
}