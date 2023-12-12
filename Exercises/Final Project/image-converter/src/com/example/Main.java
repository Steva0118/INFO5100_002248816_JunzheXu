package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Locale;

/**
 * main boot
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Locale.setDefault(Locale.US);
        stage.setTitle("Image converter");
        Parent root = FXMLLoader.load(getClass().getResource("layout.fxml"));
        stage.setScene(new Scene(root));
        stage.show();
    }
}