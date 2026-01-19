package timur.ExceptionSmartphone;

public class Smartphone {
    private int battery;
    private String model;
    boolean overheated;

    public Smartphone(int battery, boolean overheated){
        this.battery = battery;
        this.model = model;
        this.overheated = overheated;
    }
    public int getBattery(){
        return battery;
    }
    public void setBattery(int battery){
        this.battery = battery;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public boolean getOverheated(){
        return overheated;
    }
    public void setOverheated(boolean overheated) {
        this.overheated = overheated;
    }
}
