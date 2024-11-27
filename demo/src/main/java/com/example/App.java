package com.example;
import javafx.scene.*;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;


import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    public static Stage stage;
    public static Scene scene;
    public static Group group = new Group();
    public static double screenSizeX = Screen.getPrimary().getVisualBounds().getWidth();
    public static double screenSizeY = Screen.getPrimary().getVisualBounds().getHeight();

    @Override
    public void start(Stage stage) throws IOException {
        App.stage = stage;
        scene = new Scene(group);
        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.show();
        LevelConstruct startScreen = new StartScreen();
        startScreen.onStart();
        
        
        

    }

    public static void main(String[] args) {
        launch();
    }

}