package SDA.Kompozyt.DirectoryTree;

public class Main {
    public static void main(String[] args) {
        Directory root = new Directory("/root");
        Directory multi = new Directory("/Multimedia");
        Directory music = new Directory("/Music");
        SystemFile video = new Directory("/Video");

        File test = new File("test.txt");
        File r = new File("r.txt");
        File mus1 = new File("1.mp3");
        File mus2 = new File("2.mp4");

        root.addChildren(multi);
        root.addChildren(test);

        multi.addChildren(r);
        multi.addChildren(music);
        multi.addChildren(video);

        music.addChildren(mus1);
        video.addChildren(mus2);

        root.showMe();

    }
}
