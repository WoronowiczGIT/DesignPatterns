package SDA.ObiektNULL.TemperatureConverter;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Objects;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class TempConverterFactoryTest {

    @Test
    public void try_if_Factory_returns_NullConverter_in_case_of_incorrect_dataset() {
        //given
        TempConverterFactory factory = new TempConverterFactory();
        //when
        TempConverter converter = factory.getConverter("Some error");
        //then
        Assert.assertNotNull(converter);
        Assert.assertTrue(converter instanceof NullConverter);
    }

    @Test
    @Parameters(method = "converterParams")
    public void check_if_factory_returns_right_converter(String code, TempConverter expected) {
        //given
        TempConverterFactory factory = new TempConverterFactory();
        //when
        TempConverter actuall = factory.getConverter(code);
        //then

    }


    public Object[] converterParams() {
        return new Object[]{
                new Object[]{"CtoK", new CtoKTempConverter()},
                new Object[]{"CtoF", new CtoFTempConverter()},
                new Object[]{"error", new NullConverter()},
        };
    }


}