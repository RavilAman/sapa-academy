package ulykbekova.hw.five;

import java.util.logging.Logger;

public class Car {
    private int fuel;
    private String name;
    private boolean engineBroken;
    public static Logger logger = Logger.getLogger(Car.class.getName());
    public Car(int fuel, boolean engineBroken, String name) {
        this.fuel = fuel;
        this.engineBroken = engineBroken;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getFuel() {
        return fuel;
    }
    public boolean isEngineBroken() {
        return engineBroken;
    }
    public void setFuel(int a) {
        this.fuel = a;
    }
    public static void drive(Car car) throws EngineBrokenException, FuelEmptyException {
        while (car.getFuel() > 0) {
            logger.info("Car fuel " + " " + car.getFuel());
            car.setFuel(car.getFuel() - 1);
            if (car.isEngineBroken()) {
                throw new EngineBrokenException("На машине " + car.getName() + " ❗ Мотор неисправен!");
            }
            if (car.getFuel() == 0) {
                throw new FuelEmptyException("На машине " + car.getName() + " ❗ Топливо закончилось! ");
            }
        }
    }
}