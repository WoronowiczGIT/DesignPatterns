package SDA.Stan.CellPhoneVolumeState;

public class LoudState implements VolumeState {

    @Override
    public void increaseVolume(CellPhone phone) {
        int currentVolume = phone.getVolume();
        System.out.println("current volume: " + currentVolume);

        if(phone.getMaxVolume() > currentVolume){
            phone.setVolume(++currentVolume);
        }else phone.setState(new MaxVolumeState());
    }

    @Override
    public void decreaseVolume(CellPhone phone) {
        int currentVolume = phone.getVolume();
        System.out.println("current volume: " + currentVolume);

        if(phone.getMinVolume() < currentVolume){
            phone.setVolume(--currentVolume);
        }else {
            System.out.println("Vibration mode");
            phone.setState(new VibrationState());
        }
    }

}
