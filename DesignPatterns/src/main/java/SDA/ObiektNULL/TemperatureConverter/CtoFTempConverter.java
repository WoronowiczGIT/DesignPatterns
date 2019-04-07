package SDA.ObiektNULL.TemperatureConverter;

public class CtoFTempConverter implements TempConverter {
    @Override
    public Double convert(Double temp) {
        return (temp*2)+30;
    }
}
