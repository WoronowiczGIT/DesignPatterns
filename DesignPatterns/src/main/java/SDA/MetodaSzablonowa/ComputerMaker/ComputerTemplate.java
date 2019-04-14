package SDA.MetodaSzablonowa.ComputerMaker;

public abstract class ComputerTemplate {

    public final void assembleDesktop(){
        System.out.println("Processor: "+getProcessor());
        System.out.println("Motherboard: "+getMotherboard());
        System.out.println("RAM: "+getRAM());
        System.out.println("Has SSD: "+isSSD());
        System.out.println("Disk capacity: "+getDiskSpace());
        System.out.println("Graphics: "+getGraphicCard());
        System.out.println("System: "+getOperatingSystem());
    }

    abstract String getProcessor();
    abstract String getMotherboard();
    abstract String getRAM();
    abstract Boolean isSSD();
    abstract Integer getDiskSpace();
    abstract String getGraphicCard();
    abstract String getOperatingSystem();
}
