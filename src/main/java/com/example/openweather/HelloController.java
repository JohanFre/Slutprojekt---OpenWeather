package com.example.openweather;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import org.json.JSONException;

import java.io.IOException;
import java.util.Locale;

public class HelloController {

    @FXML
    private ImageView img;
    @FXML
    private Label cityText;
    @FXML
    private Label temp;
    @FXML
    private Label weather;
    @FXML
    private Label description;
    @FXML
    private TextField textField;


    @FXML
    protected void searchBtnClick() throws JSONException, IOException {

        String cityInput = textField.getText();

        Reader.search = cityInput;

        Reader.method();

        img.setImage(new Image(ImageHandler.getImage(WeatherBean.getIconInfo())));

        cityText.setText(WeatherBean.getCityInfo());
        temp.setText(WeatherBean.getTempInfo());
        weather.setText(WeatherBean.getWeatherInfo());
        description.setText(WeatherBean.getDescriptionInfo().toUpperCase(Locale.ROOT));

    }
}