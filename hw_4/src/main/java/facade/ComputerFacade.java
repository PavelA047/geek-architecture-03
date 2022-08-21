package facade;

public class ComputerFacade {
    protected Computer computer;
    private StringBuilder sb;

    public ComputerFacade(Computer computer) {
        this.computer = computer;
        this.sb = new StringBuilder();
    }

    public String turnOn() {
        sb.setLength(0);
        return sb.append(computer.getElectricShock())
                .append(computer.makeSound())
                .append(computer.showLoadingScreen())
                .append(computer.bam())
                .toString();
    }

    public String turnOff() {
        sb.setLength(0);
        return sb.append(computer.closeEverything())
                .append(computer.pullCurrent())
                .append(computer.sooth())
                .toString();
    }
}
