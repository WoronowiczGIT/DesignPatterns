package SDA.MetodaSzablonowa.ComputerMaker;

public class HighEndDesktop extends ComputerTemplate {
    @Override
    String getProcessor() {
        return "Intel i9";
    }

    @Override
    String getMotherboard() {
        return "MSI";
    }

    @Override
    String getRAM() {
        return "32GB";
    }

    @Override
    Boolean isSSD() {
        return true;
    }

    @Override
    Integer getDiskSpace() {
        return 2048;
    }

    @Override
    String getGraphicCard() {
        return "Readon 9X";
    }

    @Override
    String getOperatingSystem() {
        return "Windows 10";
    }
}
