package SDA.ObiektNULL.TemperatureConverter;

public class CtoKTempConverter implements TempConverter{
    @Override
    public Double convert(Double temp) {
        return temp+274.15;
    }
}
