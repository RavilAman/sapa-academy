package timur.hw3;

public class CeltoFahr extends AbstractConvert implements Convert {
    @Override
    public double convert(double a){
        return (a * 9 / 5) + 32;
    }
    @Override
    public void readAndConvert() {

    }
}
