package yernat.hw5;

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

    public boolean isEngineBroken() {
        return engineBroken;
    }

    public void setFuel(int i){
        this.fuel = i;
    }

    public void setName(){
        this.name = name;
    }

    public void setEngineBroken(){
        this.engineBroken = engineBroken;
    }
}
