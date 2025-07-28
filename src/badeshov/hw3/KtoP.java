package badeshov.hw3;

public class KtoP extends AbstractConvert {
    @Override
    public void convertation() {
        double k = super.readValue() * 2.20;
        super.printConversion(k);
    }

    @Override
    String getUnitOfMeasurement() {
        return "Kilogram to Pound";
    }
}