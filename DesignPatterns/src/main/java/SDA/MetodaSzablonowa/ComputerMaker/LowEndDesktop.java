package SDA.MetodaSzablonowa.ComputerMaker;

public class LowEndDesktop extends ComputerTemplate {
    @Override
    String getProcessor() {
        return "Intel i3";
    }

    @Override
    String getMotherboard() {
        return "Gigabyte";
    }

    @Override
    String getRAM() {
        return "4GB";
    }

    @Override
    Boolean isSSD() {
        return false;
    }

    @Override
    Integer getDiskSpace() {
        return 512;
    }

    @Override
    String getGraphicCard() {
        return "Gigabyte";
    }

    @Override
    String getOperatingSystem() {
        return "Windows 7";
    }
}
