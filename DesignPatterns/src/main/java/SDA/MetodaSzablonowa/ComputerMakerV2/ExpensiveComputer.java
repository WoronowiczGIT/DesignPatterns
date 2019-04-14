package SDA.MetodaSzablonowa.ComputerMakerV2;

public class ExpensiveComputer extends ComputerMaker {
    @Override
    String setProcessor() {
        return "Intel i9";
    }

    @Override
    String setRam() {
        return "32GB";
    }

    @Override
    Boolean setSSD() {
        return true;
    }

    @Override
    String setDiskSpace() {
        return "2TB";
    }

    @Override
    String setOperatingSystem() {
        return "Windows 10";
    }
}
