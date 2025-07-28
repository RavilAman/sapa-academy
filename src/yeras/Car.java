package yeras;

public class Car {
    private int fuel;
    private String name;
    private boolean engineBroken;

    public Car(int fuel, String name, boolean engineBroken){
        this.fuel = fuel;
        this.name = name;
        this.engineBroken = engineBroken;
    }
    public int getFuel(){
        return fuel;
    }
    public String getName(){
        return name;
    }
    public boolean getenginBroken(){
        return engineBroken;
    }
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}
