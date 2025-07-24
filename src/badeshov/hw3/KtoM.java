package badeshov.hw3;

public class KtoM extends AbstractConvert {

    @Override
    public void convertation() {
        double k = super.readValue();
        double m = k * 0.62;
        super.printConversion(m);
    }

    @Override
    String getUnitOfMeasurement() { return "Kilometer to Mile"; }
}