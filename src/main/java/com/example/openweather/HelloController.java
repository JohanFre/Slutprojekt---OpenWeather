package com.example.openweather;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText(WeatherBean.getTempInfo() + " " + WeatherBean.getWeatherInfo() + " " + WeatherBean.getDescriptionInfo());
    }
}