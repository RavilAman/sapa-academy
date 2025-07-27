package badeshov.hw3;

public class KtoM extends AbstractConvert {

    @Override
    public void convertation() {
        double k = super.readValue() * 0.62;
        super.printConversion(k);
    }

    @Override
    String getUnitOfMeasurement() { return "Kilometer to Mile"; }
}