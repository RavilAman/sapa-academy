package yernat.hw3;

public class CeltoFa extends AbstractConvert{

    @Override
    public double convert(double celcius) {
        double faranheit = 32;
        double celTofar = celcius * faranheit;

        return celTofar;
    }

    @Override
    String getConvertName() {
        return "CeltoFa";
    }
}
