package com.example;

import javafx.scene.*;
import javafx.scene.shape.*;
import java.util.Random;
import java.util.ArrayList;

public class ModularSquare extends Rectangle {
    Rectangle shadowRectangle;
    boolean isBeingDragged;
    int size;
    double sideLength;
    double yVel;
    public static ArrayList<ModularSquare> squareMasterList = new ArrayList<>();

    ModularSquare(double xLoc, double yLoc){
        super();
        size = new Random().nextInt(4)+1;
        sideLength = chooseSize(size);
        this.setLayoutX(xLoc);
        this.setLayoutY(yLoc);
        this.setWidth(sideLength);
        this.setHeight(sideLength);
        shadowRectangle = new Rectangle(xLoc, yLoc, sideLength, sideLength);
        isBeingDragged = false;
        squareMasterList.add(this);
        App.group.getChildren().addAll(shadowRectangle, this);
        


    }
    public double chooseSize(int size){
        switch (size) {
            case 1:
                return 75;
            case 2:
                return 100;
            case 3:
                return 150;
            case 4:
                return 200;
            default:
                return -1;    
        }
    }

    public void gravityApp(){
        if(this.isBeingDragged == false){
            yVel = yVel + .030;
            this.shadowRectangle.setLayoutY(this.getLayoutY()+ yVel);
            CollisionSystem.checkBarrierCollision();
        }else{ yVel = 0;}
    }

    public void setLayoutBothX(double val){
        this.setLayoutX(val);
        this.shadowRectangle.setLayoutX(val);
    }

    public void setLayoutBothY(double val){
        this.setLayoutY(val);
        this.shadowRectangle.setLayoutY(val);
    }
}




