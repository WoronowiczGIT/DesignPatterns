package SDA.Kompozyt.DirectoryTree;

import java.util.ArrayList;
import java.util.List;

public class Directory extends SystemFile {
    List<SystemFile> zawartosc = new ArrayList<>();

    Directory(String name) {
        super(name);
    }

    @Override
    public void addChildren(SystemFile file) {
        zawartosc.add(file);
    }

    @Override
    public void removeChildren(SystemFile file) {
        zawartosc.remove(file);
    }

    @Override
    public void showMe() {
        System.out.println(name);
        for(SystemFile x : zawartosc){
            x.showMe();
        }
    }
}
