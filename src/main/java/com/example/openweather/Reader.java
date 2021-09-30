package com.example.openweather;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Reader {

    public static String search = "lund";

    public static void method() throws IOException, JSONException {


        // Reads the API from the URL and saving it in JSON Object (String format).
        URL url = new URL("https://api.openweathermap.org/data/2.5/weather?q=" + search + "&appid=b0a57c1fc2dbb74642fdc7bb28541a87");
        URLConnection urlConn = url.openConnection();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        urlConn.getInputStream()));
        String inputLine;

        StringBuilder ApiResponse = new StringBuilder();

        while ((inputLine = in.readLine()) != null) {
            ApiResponse.append(inputLine);
        }

        in.close();
        JSONObject json = new JSONObject (String.valueOf(ApiResponse));


        // Fetching temperature and converts it from Kelvin -> Celsius.
        String tempKelvin = json.getJSONObject("main").getString("temp");
        float celsFloat = Float.parseFloat(tempKelvin);
        celsFloat = (float) (celsFloat - 273.15);
        String tempCels = String.format("%.01f", celsFloat);
        //Setting temperature in WeatherBean.
        WeatherBean.setTempInfo(tempCels + " °C");

        // Fetching city name and sets it in WeatherBean.
        String city = json.getString("name");
        WeatherBean.setCityInfo(city);

        // Fetching the array and loops through it to get different elements and setting it in bean.
        JSONArray jsonArray = (JSONArray) json.get("weather");
        for (int i = 0; i <jsonArray.length(); i++) {
            JSONObject obj= (JSONObject) jsonArray.get(i);
            String weather = (String) obj.get("main");
            String description = (String) obj.get("description");
            String icon = (String) obj.get("icon").toString();
            System.out.println(icon);
            WeatherBean.setWeatherInfo(weather);
            WeatherBean.setDescriptionInfo(description);
            WeatherBean.setIconInfo(icon);

        }
    }

}

