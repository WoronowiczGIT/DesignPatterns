package SDA.ObiektNULL.TemperatureConverter;

public class NullConverter implements TempConverter {
    @Override
    public Double convert(Double temp) {
        return Double.MIN_VALUE;
    }
}
