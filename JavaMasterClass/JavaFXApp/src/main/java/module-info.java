module com.example.javafxapp {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.web;

    opens com.example.javafxapp to javafx.fxml;
    exports com.example.javafxapp;
}