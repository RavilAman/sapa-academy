package timur.Generics;

public class PairMain {
    public static void main(String[] args){

        System.out.println("Тест 1: Создание и базовые методы");
        Pair<String, Integer> pair1 = new Pair<>("Возраст", 25);

        System.out.println("Ключ: " + pair1.getKey());
        System.out.println("Значение: " + pair1.getValue());

        pair1.setValue(30);
        System.out.println("После изменении: " + pair1.getValue());

        System.out.println("Метод SWAP:");
        Pair<String, Integer> pair2 = new Pair<>("Имя", 100);
        System.out.println("Before Swap: " + pair2.getKey()  + ", value: " + pair2.getValue());

        Pair<Integer, String> swapped = pair2.swap();
        System.out.println("After Swap: " + swapped.getKey() + ", value: " + swapped.getValue());

        System.out.println("Comaprable");
        Pair<Integer, String> pair3 = new Pair<>(50, "A");
        Pair<Integer, String> pair4 = new Pair<>(100, "B");

        boolean result1 = Pair.comparePairs(pair3, pair4);
        System.out.println("Сравнение: (50>=100) " + result1);

        boolean result2 = Pair.comparePairs(pair4, pair3);
        System.out.println("Сравнение: (100<=50) " + result2);

    }
}
