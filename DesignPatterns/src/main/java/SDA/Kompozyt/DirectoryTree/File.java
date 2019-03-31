package SDA.Kompozyt.DirectoryTree;

public class File extends SystemFile {

    File(String name) {
        super(name);
    }

    @Override
    public void addChildren(SystemFile file) {
        throw new UnsupportedOperationException("file is most basic component");
    }

    @Override
    public void removeChildren(SystemFile file) {
        throw new UnsupportedOperationException("file is most basic component");
    }

    @Override
    public void showMe() {
        System.out.println(name);
    }
}
