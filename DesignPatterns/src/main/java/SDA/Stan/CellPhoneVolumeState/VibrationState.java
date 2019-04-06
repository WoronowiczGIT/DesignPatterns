package SDA.Stan.CellPhoneVolumeState;

public class VibrationState implements  VolumeState {

    @Override
    public void increaseVolume(CellPhone phone) {
        System.out.println("turning off vibrations");
        phone.setState(new LoudState());
    }

    @Override
    public void decreaseVolume(CellPhone phone) {
        System.out.println("entering silent mode");
        phone.setState(new SilentState());
    }


}
