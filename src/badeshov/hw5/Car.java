package badeshov.hw5;

public class Car {
    private int fuel;
    private String name;
    private boolean engineBroken;

    public String getName() {
        return this.name;
    }

    public int getFuel(){
        return this.fuel;
    }

    public boolean getEngineBroken() {
        return this.engineBroken;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void setEngineBroken(boolean engineBroken) {
        this.engineBroken = engineBroken;
    }

    public Car(String name, int fuel, boolean engineBroken) {
     this.name = name;
     this.fuel = fuel;
     this.engineBroken = engineBroken;
    }
}
