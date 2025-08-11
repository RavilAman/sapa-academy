package main.java.yernat;

import java.util.*;
import java.util.logging.Logger;

public class TurarbekovMain {
    private static Logger logger = Logger.getLogger(TurarbekovMain.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> shoppingList = new ArrayList<>();
        HashMap<String, Integer> itemCount = new HashMap<>();

        while (true) {
            while (true) {
                logger.info("Введите товар (или /stop для завершения): ");
                String item = scanner.nextLine();

                if (item.equals("/stop")) {
                    break;
                }

                if (!item.isEmpty()) {
                    shoppingList.add(item);
                    itemCount.put(item, itemCount.getOrDefault(item, 0) + 1);
                }
            }

            logger.info("Результаты покупок: ");

            for (Map.Entry<String, Integer> entry : itemCount.entrySet()) {
                logger.info(entry.getKey() + " - " + entry.getValue() + " шт.");
            }

            logger.info("Хотите добавить ещё товары? (да/нет): ");
            String answer = scanner.nextLine();

            if (!answer.equals("да")) {
                logger.info("Спасибо за покупки!");
                break;
            }
        }
    }
}