package com.example.openweather;

public class WeatherBean extends Reader {

    public static String tempInfo;
    public static String weatherInfo;
    public static String descriptionInfo;

    public static String getTempInfo() {
        return tempInfo;
    }

    public static void setTempInfo(String tempInfo) {
        WeatherBean.tempInfo = tempInfo;
    }

    public static String getWeatherInfo() {
        return weatherInfo;
    }

    public static void setWeatherInfo(String weatherInfo) {
        WeatherBean.weatherInfo = weatherInfo;
    }

    public static String getDescriptionInfo() {
        return descriptionInfo;
    }

    public static void setDescriptionInfo(String descriptionInfo) {
        WeatherBean.descriptionInfo = descriptionInfo;
    }
}
