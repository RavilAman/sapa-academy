package timur.hw5;

public class Car {
    private int fuel;
    private String name;
    private boolean engineBroken;

    public Car(int fuel, boolean engineBroken) {
        this.fuel = fuel;
        this.name = name;
        this.engineBroken = engineBroken;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEngineBroken(boolean engineBroken) {
        this.engineBroken = engineBroken;
    }

    public boolean getEngineBroken() {
        return engineBroken;
    }
}


