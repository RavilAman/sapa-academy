package yernat.hw5;

public class Drive {
    public static void drive(Car car) throws FuelEmptyException {
        while (car.getFuel() > 0) {
            if (car.isEngineBroken()) {
                throw new EngineBrokenException("❗ Мотор неисправен!");
            }

            car.setFuel(car.getFuel() - 1);
            System.out.println("Car fuel: " + car.getFuel());

            if (car.getFuel() == 0) {
                throw new FuelEmptyException("❗ Топливо закончилось!");
            }
        }
    }
}
