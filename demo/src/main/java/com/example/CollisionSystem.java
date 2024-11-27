package com.example;

public class CollisionSystem {
    
    public static Barrier checkBarrierCollision(){
        for(int i = 0; i < ModularSquare.squareMasterList.size(); i++){
            for(int j = 0; j < Barrier.barrierMasterList.size(); j++){
                
                if(ModularSquare.squareMasterList.get(i).shadowRectangle.getBoundsInParent().intersects(Barrier.barrierMasterList.get(j).getBoundsInParent())) return Barrier.barrierMasterList.get(j);
            }
        }
        return null;
    }

}
