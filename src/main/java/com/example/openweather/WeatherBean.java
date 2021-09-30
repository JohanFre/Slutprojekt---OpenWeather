package com.example.openweather;

public class WeatherBean extends Reader {

    public static String tempInfo;
    public static String weatherInfo;
    public static String descriptionInfo;
    public static String iconInfo;

    public static String getCityInfo() {
        return cityInfo;
    }

    public static void setCityInfo(String cityInfo) {
        WeatherBean.cityInfo = cityInfo;
    }

    public static String cityInfo;

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


    public static void setIconInfo(String iconInfo) {
        WeatherBean.iconInfo = iconInfo;
    }

    public static String getIconInfo() {
        return iconInfo;
    }
}
