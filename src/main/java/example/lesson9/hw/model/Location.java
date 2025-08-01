package example.lesson9.hw.model;

import lombok.ToString;

@ToString
public class Location {
    public String name;
    public String region;
    public String country;
    public double lat;
    public double lon;
    public String tz_id;
    public long localtime_epoch;
    public String localtime;
}
