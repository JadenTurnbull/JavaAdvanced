module com.example.layouts {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gridpane to javafx.fxml;
    exports com.example.gridpane;
}