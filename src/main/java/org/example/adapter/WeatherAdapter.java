package org.example.adapter;

public class WeatherAdapter {

    public void findWeather(int zipcode){
        String city = null;
        if(zipcode==411014){
            city = "pune";
        }

        WeatherFinderImpl weatherFinder = new WeatherFinderImpl();
        weatherFinder.find(city);
    }
}
