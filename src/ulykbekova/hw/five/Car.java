package ulykbekova.hw.five;

import java.util.logging.Logger;

public class Car {
    public int fuel;
    public String name;
    public  boolean engineBroken;
    public static Logger logger = Logger.getLogger(Car.class.getName());


    public  Car (int fuel, boolean engineBroken) {
        this.fuel = fuel;
        this.engineBroken=engineBroken;
    }
    public int getFuel() {
        return fuel;
    }
    public boolean isEngineBroken(){
        return engineBroken;
    }
    public void setFuel(int a){
        this.fuel=a;
    }
    public void setEngineBroken(boolean engineBroken){
        this.engineBroken=engineBroken;
    }
    public static void drive(Car car) throws EngineBrokenException, FuelEmptyException{
      logger.info("Car fuel "+ " "+ car.getFuel());
        while (car.getFuel()>0){
            car.setFuel(car.getFuel()-1);
            logger.info("Car fuel "+ " "+ car.getFuel());

            if (car.isEngineBroken()){
                throw new EngineBrokenException("❗ Мотор неисправен!");
            }

            if (car.getFuel()==0){
                throw  new FuelEmptyException("❗ Топливо закончилось! ");
            }
        }
    }
}






