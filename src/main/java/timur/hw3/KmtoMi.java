package timur.hw3;

public class KmtoMi extends AbstractConvert implements Convert {
    @Override
    public double convert(double a){
        return (a * 0.621371);
    }
    @Override
    public void readAndConvert() {
    }
}
