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


    public static void method() throws IOException, JSONException {
        URL url = new URL("https://api.openweathermap.org/data/2.5/weather?q=rome&appid=b0a57c1fc2dbb74642fdc7bb28541a87");
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

        String temp = json.getJSONObject("main").getString("temp");
        System.out.println(temp);
        WeatherBean.setTempInfo(temp);


        JSONArray jsonArray = (JSONArray) json.get("weather");
        for (int i = 0; i <jsonArray.length(); i++) {
            JSONObject obj= (JSONObject) jsonArray.get(i);
            String weather = (String) obj.get("main");
            String description = (String) obj.get("description");
            WeatherBean.setWeatherInfo(weather);
            WeatherBean.setDescriptionInfo(description);

            System.out.println(weather);
            System.out.println(description);
        }
    }

}

