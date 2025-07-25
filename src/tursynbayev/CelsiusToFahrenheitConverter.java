package tursynbayev;

class CelsiusToFahrenheitConverter extends BaseConverter {
    public double convert(double value) {
        return value * 9 / 5 + 32;
    }
}
