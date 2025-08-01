package badeshov.hw3;

public class CtoF extends AbstractConvert {
    @Override
    public void convertation() {
        double c = super.readValue() * 9 / 5 + 32;
        super.printConversion(c);
    }

    @Override
    String getUnitOfMeasurement() {
        return "Celsius to Fahrenheit";
    }
}