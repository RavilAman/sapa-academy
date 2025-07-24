package badeshov.hw3;

public class KtoP extends AbstractConvert {
    @Override
    public void convertation() {
        double k = super.readValue();
        double p = k * 2.20;
        super.printConversion(p);
    }

    @Override
    String getUnitOfMeasurement() {
        return "Kilogram to Pound";
    }
}