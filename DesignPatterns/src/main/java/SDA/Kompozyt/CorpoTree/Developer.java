package SDA.Kompozyt.CorpoTree;

import SDA.Dekorator.Decorator;
import SDA.Kompozyt.DirectoryTree.SystemFile;

public class Developer implements EmployeeInterface {
    String name;

    Developer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addChildren(EmployeeInterface emp) {
        throw  new UnsupportedOperationException("developer has no power!");
    }

    @Override
    public void removeChildren(EmployeeInterface emp) {
        throw  new UnsupportedOperationException("developer has no power!");
    }

    @Override
    public void showMe() {
       // System.out.println(name+" "+ getClass().getSimpleName());
    }
}
