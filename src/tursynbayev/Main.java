package tursynbayev;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        logger.info("Enter numbers to box:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        ValueBox<Integer> num1 = new ValueBox<>(a );
        ValueBox<Integer> num2 = new ValueBox<>(b);
        logger.info("Num1 value: " + num1.getValue());
        logger.info("Num2 value: " + num2.getValue());
        logger.info("Numbers equal: " + num1.isEqual(num2));
        logger.info("Enter number to set");
        int c = scanner.nextInt();
        num1.setValue(c);
        logger.info("Num1 new value: " + num1.getValue());
        logger.info("Numbers are equal now? " + num1.isEqual(num2));
        Integer max = ValueBox.max(num1, num2);
        logger.info("Max value: " + max);
    }
}
