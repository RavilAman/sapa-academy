package example.lesson9.hw.model;

import lombok.ToString;


public class Hour {
    public long time_epoch;
    public String time;
    public double temp_c;
    public double temp_f;

    @Override
    public String toString() {
        return "Hour{" +
                "time_epoch=" + time_epoch +
                ", time='" + time + '\'' +
                ", temp_c=" + temp_c +
                ", temp_f=" + temp_f +
                ", is_day=" + is_day +
                ", condition=" + condition +
                ", wind_mph=" + wind_mph +
                ", wind_kph=" + wind_kph +
                ", wind_degree=" + wind_degree +
                ", wind_dir='" + wind_dir + '\'' +
                ", pressure_mb=" + pressure_mb +
                ", pressure_in=" + pressure_in +
                ", precip_mm=" + precip_mm +
                ", precip_in=" + precip_in +
                ", snow_cm=" + snow_cm +
                ", humidity=" + humidity +
                ", cloud=" + cloud +
                ", feelslike_c=" + feelslike_c +
                ", feelslike_f=" + feelslike_f +
                ", windchill_c=" + windchill_c +
                ", windchill_f=" + windchill_f +
                ", heatindex_c=" + heatindex_c +
                ", heatindex_f=" + heatindex_f +
                ", dewpoint_c=" + dewpoint_c +
                ", dewpoint_f=" + dewpoint_f +
                ", will_it_rain=" + will_it_rain +
                ", chance_of_rain=" + chance_of_rain +
                ", will_it_snow=" + will_it_snow +
                ", chance_of_snow=" + chance_of_snow +
                ", vis_km=" + vis_km +
                ", vis_miles=" + vis_miles +
                ", gust_mph=" + gust_mph +
                ", gust_kph=" + gust_kph +
                ", uv=" + uv +
                ", short_rad=" + short_rad +
                ", diff_rad=" + diff_rad +
                ", dni=" + dni +
                ", gti=" + gti +
                '}';
    }

    public int is_day;
    public Condition condition;
    public double wind_mph;
    public double wind_kph;
    public int wind_degree;
    public String wind_dir;
    public double pressure_mb;
    public double pressure_in;
    public double precip_mm;
    public double precip_in;
    public double snow_cm;
    public int humidity;
    public int cloud;
    public double feelslike_c;
    public double feelslike_f;
    public double windchill_c;
    public double windchill_f;
    public double heatindex_c;
    public double heatindex_f;
    public double dewpoint_c;
    public double dewpoint_f;
    public int will_it_rain;
    public int chance_of_rain;
    public int will_it_snow;
    public int chance_of_snow;
    public double vis_km;
    public double vis_miles;
    public double gust_mph;
    public double gust_kph;
    public int uv;
    public int short_rad;
    public int diff_rad;
    public int dni;
    public int gti;
}
