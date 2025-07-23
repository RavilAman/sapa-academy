package badeshov.hw3;

public class CtoF extends AbstractConvert {
    @Override
    public void convertation() {
        double c = super.readValue();
        double t = c * 9 / 5;
        double f = t + 32;
        super.printConversion(f);
    }

    @Override
    String getUnitOfMeasurement() {
        return "Celsius to Fahrenheit";
    }
}