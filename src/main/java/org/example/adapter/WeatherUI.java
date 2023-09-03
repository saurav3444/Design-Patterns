package org.example.adapter;

public class WeatherUI {

    public void findTemperature(int zipcode){
        WeatherAdapter weatherAdapter = new WeatherAdapter();
        weatherAdapter.findWeather(zipcode);
    }
}