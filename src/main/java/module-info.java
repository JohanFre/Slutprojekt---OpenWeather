module com.example.openweather {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.xml;
    requires android.json;

    opens com.example.openweather to javafx.fxml;
    exports com.example.openweather;
}