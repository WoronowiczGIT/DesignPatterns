package SDA.ObiektNULL.TemperatureConverter;

public class Main {


    public static void main(String[] args) {

        TempConverterFactory factory = new TempConverterFactory();
        TempConverter converter = factory.getConverter("CtoK");
        Double c = 10D;

        Double k = converter.convert(c);
        System.out.println(k);

        converter = factory.getConverter("sdfsdf");
        k = converter.convert(c);
        System.out.println(k);


    }
}
