package example.lesson9.model;

public class CurrencyItem {
    private String code;
    private String date;
    private double rate;
    private int quantity;
    private String trend;
    private String change;

    public CurrencyItem(String code, String date, double rate, int quantity, String trend, String change) {
        this.code = code;
        this.date = date;
        this.rate = rate;
        this.quantity = quantity;
        this.trend = trend;
        this.change = change;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getTrend() {
        return trend;
    }

    public void setTrend(String trend) {
        this.trend = trend;
    }

    public String getChange() {
        return change;
    }

    public void setChange(String change) {
        this.change = change;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f KZT (x%d), %s %s", code, rate, quantity, trend, change);
    }
}
