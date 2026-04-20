package main.java.badeshov.hw7;

import java.util.Objects;

public class SuperMarket {
    private String tovar;

    public String getTovar() {
        return tovar;
    }

    public void setTovar(String tovar) {
        this.tovar = tovar;
    }

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public SuperMarket(String tovar, int shtuk) {
        this.tovar = tovar;
        this.value = shtuk;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SuperMarket that = (SuperMarket) o;
        return value == that.value && Objects.equals(tovar, that.tovar);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
