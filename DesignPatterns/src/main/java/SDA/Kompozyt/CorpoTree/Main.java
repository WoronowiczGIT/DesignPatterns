package SDA.Kompozyt.CorpoTree;

public class Main {
    public static void main(String[] args) {
        Developer d1 = new Developer("Jan");
        Developer d2 = new Developer("Adas");
        Developer d3 = new Developer("Tomek");

        Menager m1 = new Menager("szef");
        Menager m2 = new Menager("WiekszySzef");
        Menager m3 = new Menager("NajwiekszySzef");

        m1.addChildren(d3);
        m1.addChildren(d2);
        m2.addChildren(m1);
        m3.addChildren(m2);
        m3.addChildren(d1);

        m3.showMe();

    }
}
