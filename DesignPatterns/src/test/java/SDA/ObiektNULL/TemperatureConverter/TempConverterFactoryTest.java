package SDA.ObiektNULL.TemperatureConverter;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Objects;

import static org.junit.Assert.*;


public class TempConverterFactoryTest {

    @Test
    public void try_if_Factory_returns_NullConverter_in_case_of_incorrect_data_set() {
        //given
        TempConverterFactory factory = new TempConverterFactory();
        //when
        TempConverter converter = factory.getConverter("Some error");
        //then
        Assert.assertNotNull(converter);
        Assert.assertTrue(converter instanceof NullConverter);
    }

}