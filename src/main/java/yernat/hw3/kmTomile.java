package yernat.hw3;

public class kmTomile extends AbstractConvert{

    @Override
    public double convert(double km) {

        double mile = 0.621371;
        double kmTomile = km * mile;

        return kmTomile;
    }

    @Override
    String getConvertName() {
        return "kmTomile";
    }
}
