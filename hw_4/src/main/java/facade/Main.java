package facade;

public class Main {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade(new Computer());
        System.out.println(computer.turnOn());
        System.out.println();
        System.out.println(computer.turnOff());
    }
}
