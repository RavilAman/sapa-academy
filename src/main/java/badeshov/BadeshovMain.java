package badeshov;

import badeshov.hw6.ValueBox;

import java.lang.reflect.Array;

public class BadeshovMain {

    public static void main(String[] args) {
        Array<Integer> List = new Array<>();
        list.add(7);
        list.add(9);

        ValueBox<Integer> vb = new ValueBox<>(T value);
        int maxOfTheValue = vb.getValue().max();
        ValueBox first = new ValueBox();
        ValueBox second = new ValueBox();

        max(first, second);
    }

    public static <T extends Comparable<T>> T max(ValueBox<T> first, ValueBox<T> second) {
        T max = (0 <= first.compareTo(second)) ? first : second;
        return max;
    }
}