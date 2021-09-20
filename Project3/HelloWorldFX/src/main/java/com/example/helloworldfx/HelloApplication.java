package com.example.helloworldfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
          FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

//        GridPane root = new GridPane();
//        root.setAlignment(Pos.CENTER);
//        root.setVgap(10);
//        root.setHgap(10);
//
//        Label greeting = new Label("Welcome to JavaFX!");
//        greeting.setTextFill(Color.ORANGERED);
//        greeting.setFont(Font.font("Comic Sans", FontWeight.BOLD, 70));
//        root.getChildren().add(greeting);
//
//        stage.setTitle("Hello JavaFX!");
//        stage.setScene(new Scene(root, 700, 275));
//        stage.show();

        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello JavaFX!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}