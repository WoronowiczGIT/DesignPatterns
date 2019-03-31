package SDA.Kompozyt.CorpoTree;

import SDA.Kompozyt.DirectoryTree.SystemFile;

import java.util.ArrayList;
import java.util.List;

public class Menager implements EmployeeInterface {
    private List<EmployeeInterface> emplyees = new ArrayList<>();
    private String name;

    Menager(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addChildren(EmployeeInterface employee) {
        emplyees.add(employee);
    }

    @Override
    public void removeChildren(EmployeeInterface employee) {
        emplyees.remove(employee);

    }
    @Override
    public void showMe() {
        System.out.println(name);
        for(EmployeeInterface e : emplyees){
            System.out.println(" -> "+e.getName());
        }
        for(EmployeeInterface e : emplyees){
            e.showMe();
        }
    }
}
