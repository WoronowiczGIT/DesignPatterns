package SDA.Kompozyt.CorpoTree;

import SDA.Kompozyt.DirectoryTree.SystemFile;

public interface EmployeeInterface {
    String getName();
    void addChildren(EmployeeInterface emp);
    void removeChildren(EmployeeInterface emp);
    void showMe();
}
