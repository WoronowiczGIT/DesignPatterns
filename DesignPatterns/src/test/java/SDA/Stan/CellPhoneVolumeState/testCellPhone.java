package SDA.Stan.CellPhoneVolumeState;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class testCellPhone {
    CellPhone cellPhone;

    @Before
    public void setUp() {
        cellPhone = new CellPhone(new LoudState());
    }

    @Test
    public void testLoudStateIncVolume() {
        //given
        cellPhone.setState(new LoudState());
        cellPhone.setVolume(cellPhone.getMaxVolume() - 1);
        //when
        cellPhone.increaseVolume();
        //then
        Assert.assertTrue(cellPhone.getState() instanceof MaxVolumeState);
    }

    @Test
    public void testLouderStateDecVolume() {
        //given
        cellPhone.setVolume(cellPhone.getMinVolume() + 1);
        //when
        cellPhone.decreaseVolume();
        //then
        Assert.assertTrue(cellPhone.getState() instanceof VibrationState);

    }
}



