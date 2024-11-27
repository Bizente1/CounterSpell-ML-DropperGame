package com.example;

import javafx.scene.*;
import javafx.scene.shape.*;
import javafx.animation.*;
import javafx.util.Duration;


public class Testing1 implements LevelConstruct {

    Timeline tickTimer;

    @Override
    public void onStart() {
        App.group.getChildren().clear();
        ModularSquare rectangle = new ModularSquare(800,800);
        //rectangle.toFront();
        MakeDragable MD = new MakeDragable();
        MD.MakeDragable(rectangle);
        Barrier.addLines();

        TickTimer(rectangle);
    }

 


    public void TickTimer(ModularSquare node) {

        tickTimer = new Timeline(new KeyFrame(Duration.millis(16.67), e -> {
            node.gravityApp();
        }));
        tickTimer.setCycleCount(Animation.INDEFINITE);
        tickTimer.play();

    }
}


