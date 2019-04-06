package SDA.Stan.CellPhoneVolumeState;

public class MaxVolumeState implements VolumeState {

    @Override
    public void increaseVolume(CellPhone phone) {
        System.out.println("you reached max volume");
        phone.setState(new MaxVolumeState());
    }

    @Override
    public void decreaseVolume(CellPhone phone) {
        phone.setState(new LoudState());
    }



}
