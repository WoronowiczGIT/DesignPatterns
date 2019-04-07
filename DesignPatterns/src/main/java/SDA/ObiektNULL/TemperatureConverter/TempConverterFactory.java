package SDA.ObiektNULL.TemperatureConverter;

public class TempConverterFactory {

    public TempConverter getConverter(String converterName) {
        switch (converterName) {
            case "CtoK":
                return new CtoKTempConverter();

            case "CtoF":
                return new CtoFTempConverter();

            default:
                return new NullConverter();
        }
    }
}
