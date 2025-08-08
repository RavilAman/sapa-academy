package ulykbekova;

import sun.net.www.MessageHeader;

import java.util.*;
import java.util.logging.Logger;

public class MainErke {
    private static MessageHeader entry;
    private static final Logger logger = Logger.getLogger(MainErke.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new LinkedList<>();
        while (true) {
            logger.info("Введите товар (или /stop для завершения): ");
            String tovar = scanner.nextLine();

            if (tovar.equalsIgnoreCase("stop")) {
                Map<String, Integer> kol = getKol(list);
                for (String key : kol.keySet()) {
                    logger.info(key + " - " + kol.get(key) + " шт");
                }
                logger.info("Хотите добавить ещё товары? (да/нет)");
                String otvet = scanner.nextLine();
                if (!otvet.equalsIgnoreCase("да")) {
                    break;

                }
            }
            list.add(tovar);
        }
    }

        private static Map<String, Integer> getKol(List < String > list) {
            HashMap<String, Integer> map = new HashMap<>();
            for (String tovar : list) {
                if (map.containsKey(tovar)) {
                    map.put(tovar, map.get(tovar) + 1);
                } else {
                    map.put(tovar, 1);
                }

            }
            return map;
        }

}

