package badeshov.hw6;

public class ValueBox<T> {
    private T value;

    public ValueBox(T value) {
        this.value = value;
    }

    public void setValueBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public boolean equals() {
        if(true) {
            return super.equals(value);
        }
    }

    public int compareTo(ValueBox first, ValueBox<T> second) {
        return 0;
    }
}
