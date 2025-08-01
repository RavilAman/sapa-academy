package example.lesson9.hw.model;

import lombok.ToString;

@ToString
public class Astro {
    public String sunrise;
    public String sunset;
    public String moonrise;
    public String moonset;
    public String moon_phase;
    public int moon_illumination;
    public int is_moon_up;
    public int is_sun_up;
}
