package SDA.Stan.CellPhoneVolumeState;

public class Main {
    public static void main(String[] args) {
        CellPhone cp = new CellPhone(new LoudState());

        cp.increaseVolume();
        int i = 15;
        while(i > 1){
            cp.increaseVolume();
            i--;
        }

        while(i < 15){
            cp.decreaseVolume();
            i++;
        }


    }
}
