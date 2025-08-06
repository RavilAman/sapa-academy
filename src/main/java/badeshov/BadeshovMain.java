package badeshov;

import java.util.*;
import java.util.logging.Logger;

public class BadeshovMain {

    private static Logger logger = Logger.getLogger(BadeshovMain.class.getName());

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> pokupka = new ArrayList<>();

        while (true) {
            logger.info("Введите товар (или /stop для завершения): ");
            String next = input.next();

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

            pokupka.add(next);
        }
    }
}