package SDA.Stan.CellPhoneVolumeState;

public class LoudState implements VolumeState {

    @Override
    public void increaseVolume(CellPhone phone) {
        int currentVolume = phone.getVolume();

        if(phone.getMaxVolume()-1 <= currentVolume){
            phone.setState(new MaxVolumeState());
            currentVolume++;
        }else phone.setVolume(++currentVolume);

        System.out.println("current volume: " + currentVolume);
    }

    @Override
    public void decreaseVolume(CellPhone phone) {
        int currentVolume = phone.getVolume();

        if(phone.getMinVolume() < currentVolume){
            phone.setVolume(--currentVolume);
        }else {
            System.out.println("Vibration mode");
            phone.setState(new VibrationState());
        }
        System.out.println("current volume: " + currentVolume);
    }

}
