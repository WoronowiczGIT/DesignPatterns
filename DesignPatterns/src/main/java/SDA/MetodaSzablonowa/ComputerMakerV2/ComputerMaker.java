package SDA.MetodaSzablonowa.ComputerMakerV2;

public abstract class ComputerMaker {

   public final Computer assambleTemplate(){
        String processor = setProcessor();
        String ram = setRam();
        Boolean isSSD = setSSD();
        String diskSpace = setDiskSpace();
        String operatingSystem = setOperatingSystem();
        return new Computer(processor,ram,isSSD,diskSpace,operatingSystem);
    }

    abstract String setProcessor();
    abstract String setRam();
    abstract Boolean setSSD();
    abstract String setDiskSpace();
    abstract String setOperatingSystem();

}
