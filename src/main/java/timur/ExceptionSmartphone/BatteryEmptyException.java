package timur.ExceptionSmartphone;

public class BatteryEmptyException extends Exception{
    public BatteryEmptyException(String message){
        super(message);
    }
}
