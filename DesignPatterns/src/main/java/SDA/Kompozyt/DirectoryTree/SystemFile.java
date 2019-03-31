package SDA.Kompozyt.DirectoryTree;

public abstract class SystemFile {
    protected String name;

    SystemFile(String name) {
        this.name = name;
    }

    public abstract void addChildren(SystemFile file);
    public abstract void removeChildren(SystemFile file);
    public abstract void showMe();

}
