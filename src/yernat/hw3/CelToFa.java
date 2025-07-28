package yernat.hw3;

public class CelToFa extends AbstractConvert{

    @Override
    public double convert(double celcius) {
        double fahrenheit = 32;
        double celTofar = celcius * fahrenheit;

        return celTofar;
    }

    @Override
    String getConvertName() {
        return "celTofa";
    }
}
