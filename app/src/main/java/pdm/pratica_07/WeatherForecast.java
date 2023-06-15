package pdm.pratica_07;

import java.util.List;

import retrofit2.Call;

public class WeatherForecast implements WeatherForecastAPI{

    @Override
    public Call<WeatherForecast> getForecast(String city) {
        return null;
    }

    static class City {
        static class Coordinates {
            Float lon, lat;
        }
        String id;
        String name;
        String country;
        long population;
        long timezone;
        Coordinates coord;
    }
    static class Forecast {
        static class Temperature {
            float day, min, max, night, eve, morn;
        }
        static class Weather {
            int id;
            String main, description, icon;
        }
        long dt;
        long sunrise, sunset;
        int pressure;
        int humidity;
        float speed;
        int deg;
        int clouds;
        float pop;
        float rain;
        Temperature temp;
        Temperature feels_like;
        List<Weather> weather;
    }
    City city;
    String cod;
    Float message;
    int cnt;
    List<Forecast> list;
}
