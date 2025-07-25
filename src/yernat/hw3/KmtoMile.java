package yernat.hw3;

public class KmtoMile extends AbstractConvert{

    @Override
    public double convert(double km) {

        double mile = 0.621371;
        double KmtoMile = km * mile;

        return KmtoMile;
    }

    @Override
    String getConvertName() {
        return "KmtoMile";
    }
}
