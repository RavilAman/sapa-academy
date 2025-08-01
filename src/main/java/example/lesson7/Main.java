package example.lesson7;

import example.lesson4.Square;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();  // raw‑тип
        list.add("text");
        Integer n = (Integer) list.get(0); // ClassCastException в runtime

        ArrayList<String> list2 = new ArrayList<>(); // параметризованный тип
        list2.add("text");
//        Integer n2 = list2.get(0); // ошибка!

        String key = "Ravil";
        String value = "88005553535";

        PairWithoutGenerics pwog = new PairWithoutGenerics(key, value);
        int lengthOfTheKey = ((String) pwog.getKey()).length();

        PairWithGenerics<String, String> pwg = new PairWithGenerics<>(key, value);
        int lengthOfTheKey2 = pwg.getKey().length();
        Square a = new Square();
        Square b = new Square();
        Square c = new Square();

        minOfThree(a, b, c);
    }

//    public <E, T, R> R doSmt(E entity, T value) {
//
//    }

    <T> void printAll(List<T> list) {
        for (T o : list) {
            System.out.println(o);
        }
    }

    double average(List<? extends Number> nums) {
        double sum = 0;
        for (Number n : nums) sum += n.doubleValue();
        return sum / nums.size();
    }

    void fillWithOnes(List<? super Integer> list, int count) {
        for (int i = 0; i < count; i++) list.add(1);
    }

    public static <T extends Comparable<? super T>> T minOfThree(T a, T b, T c) {
        T min = (a.compareTo(b) <= 0) ? a : b;
        return (min.compareTo(c) <= 0) ? min : c;
    }
}
