package example.lesson9.hw.model;

import lombok.ToString;

import java.util.List;

@ToString
public class ForecastDay {
    public String date;
    public long date_epoch;
    public Day day;
    public Astro astro;
    public List<Hour> hour;
}