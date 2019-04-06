package SDA.Stan.CellPhoneVolumeState;

public class CellPhone {
    private VolumeState state;
    private int volume = 0;
    private  int maxVolume = 10;
    private  int minVolume = 1;

    CellPhone(VolumeState state) {
        this.state = state;
    }

    public void increaseVolume() {
        state.increaseVolume(this);
    }

    public void decreaseVolume() {
        state.decreaseVolume(this);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public VolumeState getState() {
        return state;
    }

    public void setState(VolumeState state) {
        this.state = state;
    }
}
