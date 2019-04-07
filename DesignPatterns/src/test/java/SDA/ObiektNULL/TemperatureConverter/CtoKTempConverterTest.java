package SDA.ObiektNULL.TemperatureConverter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CtoKTempConverterTest {

    @Test
    public void check_if_C_to_K_converter_converts(){
        //given
        CtoKTempConverter converter = new CtoKTempConverter();
        Double given = 0D;
        Double expected = 274.15;

        //when
        Double actuall = converter.convert(given);

        //Then
        Assert.assertNotNull(actuall);
        Assert.assertEquals(expected,actuall);


    }

}