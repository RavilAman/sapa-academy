package yernat.hw3;

public class KgtoFn extends AbstractConvert{

    @Override
    public double convert(double kg) {

        double pound = 2.20462;
        double KgtoPound = kg * pound;

        return KgtoPound;
    }

    @Override
    String getConvertName() {
        return "KgtoFn";
    }
}
