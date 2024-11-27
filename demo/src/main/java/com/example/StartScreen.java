package com.example;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.event.*;

public class StartScreen implements LevelConstruct{

    @Override
    public void onStart() {
        Button starButton = new Button("Click here to Start");
        //System.out.println(App.stage.getWidth());
        starButton.setLayoutX((App.screenSizeX/2)-starButton.getWidth()/2);
        starButton.setLayoutY((App.screenSizeY/2)-starButton.getHeight());
        App.group.getChildren().add(starButton);

        starButton.setOnAction(actionEvent ->{
            LevelConstruct testing = new Testing1();
            testing.onStart();
        });
    }
    
}