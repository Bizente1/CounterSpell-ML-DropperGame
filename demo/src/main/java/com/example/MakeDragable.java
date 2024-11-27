package com.example;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.input.MouseEvent;

public class MakeDragable{
    private double mouseAnchorX;
    private double mouseAnchorY;


    public void MakeDragable(ModularSquare node){
        node.setOnMousePressed(mouseEvent -> {
            mouseAnchorX = mouseEvent.getX();
            mouseAnchorY = mouseEvent.getY();
        });

        node.setOnMouseDragged(mouseEvent -> {
            node.setLayoutBothX(mouseEvent.getSceneX() - mouseAnchorX);
            node.setLayoutBothY(mouseEvent.getSceneY() - mouseAnchorY);
            node.isBeingDragged = true;
        });

        node.setOnMouseReleased(mouseEvent -> {
            node.isBeingDragged = false;
        });
    }
}