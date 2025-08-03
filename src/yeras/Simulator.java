package yeras;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Logger;

public class Simulator {
    private static final Logger logger = Logger.getLogger(Simulator.class.getName());
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        logger.info("Welcome to game CarX");
        boolean cont = true;
        while (cont){
            logger.info("Enter name of car:");
            String carname = scanner.nextLine();
            logger.info("Pour fuel:");
            int fuel = scanner.nextInt();
            boolean engineBroken = random.nextBoolean();
            Car car = new Car(fuel, carname, engineBroken);
            try {
             drive(car);
            } catch (FuelEmptyException e){
                logger.warning(e.getMessage());
            } catch (EngineBrokenException e){
                logger.severe(e.getMessage());
            }
            logger.info("Do you want to continue? (yes/no)");
            String ans = scanner.nextLine();
            cont = ans.equalsIgnoreCase("yes");
        }
        logger.info("Game is finished");
    }
    public static void drive(Car car) throws EngineBrokenException ,FuelEmptyException{
        logger.info("Car "+ car.getName()+" starts action");
        while (car.getFuel()>0){
            if (car.getenginBroken()){
            throw new EngineBrokenException("Engine is broken when driving");
            }
            int currentfuel = car.getFuel()-1;
            car.setFuel(currentfuel);
            logger.info("Fuel left in:" + car.getName() + currentfuel +  "L");
        }
        logger.info("The fuel is out in" + car.getName());
    }
}
