package yernat.hw3;

public class KgtoFn extends AbstractConvert{

    @Override
    public double convert(double kg) {

        double pound = 2.20462;
        double kgTopound = kg * pound;

        return kgTopound;
    }

    @Override
    String getConvertName() {
        return "KgtoFn";
    }
}
