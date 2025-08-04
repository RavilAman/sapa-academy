package ulykbekova;

import sun.net.www.MessageHeader;
import ulykbekova.hw.two.Rectangle;
import ulykbekova.hw.two.Square;
import ulykbekova.hw.two.Triangle;

import java.util.*;

public class MainErke {
    private static MessageHeader entry;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new LinkedList<>();
        while (true) {
            System.out.println("Введите товар (или /stop для завершения): ");
            String tovar = scanner.nextLine();
            if (tovar.equals("stop")) {
                break;
            } else {
                list.add(tovar);
            }
        }
            HashMap<String, Integer> map = new HashMap<>();
            for (String tovar : list) {
                if (map.containsKey(tovar)) {
                    map.put(tovar, map.get(tovar) + 1);
                } else {
                    map.put(tovar, 1);
                }
            }
            for (String key : map.keySet()) {
                System.out.println(key + " - " + map.get(key) + " шт");

            }
            while (true) {
                System.out.println("Хотите добавить ещё товары? (да/нет)");
                String otvet = scanner.nextLine();
                if (otvet.equals("да")) {
                    break;
                } else if(otvet.equals("нет")){
                    System.exit(0);
                }else {
                    System.out.println("Не правильное значение");
                }
            }



    }
}
