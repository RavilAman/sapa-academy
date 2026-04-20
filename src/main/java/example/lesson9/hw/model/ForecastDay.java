package example.lesson9.hw.model;

import lombok.ToString;

import java.util.List;

public class ForecastDay {
    public String date;
    public long date_epoch;
    public Day day;
    public Astro astro;
    public List<Hour> hour;

    @Override
    public String toString() {
        return "ForecastDay{" +
                "date='" + date + '\'' +
                ", date_epoch=" + date_epoch +
                ", day=" + day +
                ", astro=" + astro +
                ", hour=" + hour +
                '}';
    }
}