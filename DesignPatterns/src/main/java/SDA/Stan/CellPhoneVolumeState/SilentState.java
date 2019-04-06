package SDA.Stan.CellPhoneVolumeState;

public class SilentState implements VolumeState {
    @Override
    public void increaseVolume(CellPhone phone) {
        phone.setState(new VibrationState());
    }

    @Override
    public void decreaseVolume(CellPhone phone) {
        System.out.println("phone is in silent mode");
    }
}
