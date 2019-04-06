package SDA.Stan.CellPhoneVolumeState;

public interface VolumeState {

    void increaseVolume(CellPhone phone);
    void decreaseVolume(CellPhone phone);

    default void showState(CellPhone phone){
            System.out.println(phone.getState().getClass().getSimpleName());
        }

}
