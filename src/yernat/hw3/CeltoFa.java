package yernat.hw3;

public class CeltoFa extends AbstractConvert{

    @Override
    public double convert(double celcius) {

        double faranheit = 32;
        double CeltoFar = celcius * faranheit;

        return CeltoFar;
    }

    @Override
    String getConvertName() {
        return "CeltoFa";
    }
}
