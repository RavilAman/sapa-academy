package main.java.yernat;

import yernat.hw6.ValueBox;
import java.util.logging.Logger;

public class TurarbekovMain {
    private static Logger logger = Logger.getLogger(TurarbekovMain.class.getName());

    public static void main(String[] args) {
        ValueBox<Integer> box1 = new ValueBox<>(2005);
        ValueBox<Integer> box2 = new ValueBox<>(2025);

        logger.info("Box1: " + box1.getValue());
        logger.info("Box2: " + box2.getValue());

        logger.info("Are they equal? " + box1.isEqual(box2));

        box1.setValue(2025);
        logger.info("Now, are they equal? " + box1.isEqual(box2));

        Integer max = ValueBox.max(box1, box2);
        logger.info("Max: " + max);
    }
}