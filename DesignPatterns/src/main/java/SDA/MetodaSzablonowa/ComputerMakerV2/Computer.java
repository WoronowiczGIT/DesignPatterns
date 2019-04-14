package SDA.MetodaSzablonowa.ComputerMakerV2;

public class Computer {
    private String processor;
    private String ram;
    private Boolean isSSD;
    private String diskSpace;
    private String operatingSystem;

    public Computer(String processor, String ram, Boolean isSSD, String diskSpace, String operatingSystem) {
        this.processor = processor;
        this.ram = ram;
        this.isSSD = isSSD;
        this.diskSpace = diskSpace;
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", isSSD=" + isSSD +
                ", diskSpace='" + diskSpace + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                '}';
    }
}
