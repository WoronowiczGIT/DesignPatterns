package SDA.ObiektNULL.TemperatureConverter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CtoFTempConverterTest {
    @Test
    public void check_if_converter_converts_C_to_F(){
        //given
        CtoFTempConverter converter = new CtoFTempConverter();
        Double given = 0D;
        Double expected = 30D;

        //when
        Double actuall = converter.convert(given);

        //then
        Assert.assertNotNull(actuall);
        Assert.assertEquals(expected,actuall);
    }

}