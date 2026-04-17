package myrzakanov.hw5;

public class Car {

    private String name;
    private int fuel;
    private boolean engineBroken;

    public Car(String name, int fuel, boolean engineBroken){
        this.name = name;
        this.fuel = fuel;
        this.engineBroken = engineBroken;
    }

    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }

    public int getFuel(){
        return fuel;
    }
    public void setFuel(int i){
        this.fuel = i;
    }

    public boolean isEngineBroken() {
        return engineBroken;
    }
    public void setEngineBroken(boolean engineBroken) {
        this.engineBroken = engineBroken;
    }

    }
