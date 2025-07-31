package badeshov;

import badeshov.hw6.ValueBox;

public class BadeshovMain {

    public static void main(String[] args) {
        ValueBox<Integer> first = new ValueBox<Integer>(23567);
        ValueBox<Integer> second = new ValueBox<Integer>(342);
        System.out.println(max(first, second));
    }

    public static <T extends Comparable<T>> T max(ValueBox<T> first, ValueBox<T> second) {
        int comparedValue = first.getValue().compareTo(second.getValue());
        switch(comparedValue) {
            case 0:
            case 1:
                return first.getValue();
            case -1:
                return second.getValue();
            default:
                throw new IllegalArgumentException("Invalid value: " + comparedValue);
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        return false;
    }
}