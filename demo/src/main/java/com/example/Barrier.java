package com.example;
import java.util.ArrayList;

import javafx.scene.shape.*;

public class Barrier extends Line {

    public static ArrayList<Barrier> barrierMasterList = new ArrayList<>(); 
    
    Barrier(double sX, double sY, double eX, double eY){
        super(sX, sY, eX, eY);
        this.setStrokeWidth(App.screenSizeX/64);
        barrierMasterList.add(this);
        App.group.getChildren().add(this);
    }

    public static void addLines(){
        Barrier line1 = new Barrier(0,App.screenSizeY/4 , App.screenSizeX/4 ,App.screenSizeY/4 );
        Barrier line2 = new Barrier(App.screenSizeX/4, App.screenSizeY/4,(App.screenSizeX/4),(App.screenSizeY)-App.screenSizeY/64);
        Barrier line3 = new Barrier(App.screenSizeX/4,(App.screenSizeY)-App.screenSizeY/64 ,3*App.screenSizeX/4 ,(App.screenSizeY)-App.screenSizeY/64 );
    }    
}