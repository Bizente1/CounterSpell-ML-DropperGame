package com.example;

public class CollisionSystem {
    
    public static void checkBarrierCollision(){
        for(int i = 0; i < ModularSquare.squareMasterList.size(); i++){
            for(int j = 0; j < Barrier.barrierMasterList.size(); j++){
                if(ModularSquare.squareMasterList.get(i).shadowRectangle.getBoundsInParent().intersects(Barrier.barrierMasterList.get(j).getBoundsInParent())){
                    ModularSquare.squareMasterList.get(i).shadowRectangle.setLayoutY(ModularSquare.squareMasterList.get(i).getLayoutY());
                    System.out.println("Yes");
                }else{ModularSquare.squareMasterList.get(i).setLayoutY(ModularSquare.squareMasterList.get(i).shadowRectangle.getLayoutY());}
            }
        }
    }

}
