package timur.hw3;

public class KgtoLb extends AbstractConvert implements Convert {
    @Override
    public double convert(double a){
        return (a * 2.20462);
    }
    @Override
    public void readAndConvert() {
    }
}
