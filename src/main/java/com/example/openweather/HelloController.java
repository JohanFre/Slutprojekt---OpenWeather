package com.example.openweather;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.json.JSONException;

import java.io.IOException;

public class HelloController {

    @FXML
    private Label welcomeText;
    @FXML
    private TextField search;


    @FXML
    protected void onSearchButtonClick() throws JSONException, IOException {

        String cityInput = search.getText();

        Reader.search = cityInput;

        Reader.method();

        welcomeText.setText(WeatherBean.getTempInfo() + " " + WeatherBean.getWeatherInfo() + " " + WeatherBean.getDescriptionInfo() + " " + WeatherBean.getCityInfo());
    }
}