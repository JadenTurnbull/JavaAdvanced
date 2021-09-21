module com.example.otherlayouts {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.otherlayouts to javafx.fxml;
    exports com.example.otherlayouts;
}