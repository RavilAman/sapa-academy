package badeshov;

import main.java.badeshov.hw7.SuperMarket;

import java.util.*;

public class BadeshovMain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> pokupka = new ArrayList<>();


        while (true) {
            System.out.println("Введите товар (или /stop для завершения): ");
            String next = input.next();
            pokupka.add(next);

            for (int i = 0; i < pokupka.size(); i++) {
                if (pokupka.get(i).equals("stop")) {
                    pokupka.remove(i);
                    i--;
                }
            }

            if (next.equals("stop")) {
                HashMap<String, Integer> map = new HashMap<>();
                for (String s : pokupka) {
                    if (map.containsKey(s)) {
                        Integer i = map.get(s) + 1;
                        map.put(s, i);
                    } else {
                        map.put(s, 1);
                    }
                }
                System.out.println(map);

                System.out.println("Хотите добавить ещё товары? (да/нет): ");
                next = input.next();
                if (next.equals("да")) {
                    continue;
                } else {
                    break;
                }
            }
        }
    }
}