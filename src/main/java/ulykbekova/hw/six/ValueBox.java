package ulykbekova.hw.six;

import java.util.Scanner;

public class ValueBox<T> {
    public T value;

    public ValueBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public boolean isEguals(ValueBox<T> a) {
        return value.equals(a.getValue());
    }

    public static <T extends Comparable<T>> T max(ValueBox<T> first, ValueBox<T> second) {
        if (first.getValue().compareTo(second.getValue()) > 0) {
            return first.getValue();
        } else if (first.getValue().compareTo(second.getValue()) == 0) {
            System.out.println("числа равны ");
            return first.getValue();
        } else {
            return second.getValue();
        }
    }
}

