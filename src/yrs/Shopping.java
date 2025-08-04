package yrs;

import java.util.*;
import java.util.logging.Logger;

public class Shopping {
    private static final Logger logger = Logger.getLogger(Shopping.class.getName());
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        boolean cont = true;
        while(cont){
            logger.info("Enter a product (or enter 'stop'):");
            while (true){
                String choo = scanner.nextLine();
                if (choo.equalsIgnoreCase("stop")){
                    break;
                }
                if (!choo.isEmpty()){
                    list.add(choo);
                }
            }
            Map<String, Integer> count = new HashMap<>();
            for (String item:list){
                count.put(item, count.getOrDefault(item,0)+1);
            }
            logger.info("results of pusrchase");
            for (Map.Entry<String, Integer> entry : count.entrySet()) {
                logger.info(entry.getKey() + " — " + entry.getValue());
            }
            logger.info("Do you want to add any products: ");
            String answer = scanner.nextLine();
            if (!answer.equalsIgnoreCase("yes")) {
                cont = false;
                System.out.println("Thanks for shopping");
            }
        }
    }
}


