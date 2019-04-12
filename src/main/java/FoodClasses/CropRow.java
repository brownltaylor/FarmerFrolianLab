package FoodClasses;

import AbstractClass.Crop;

import java.util.LinkedList;

public class CropRow {
    LinkedList<Crop> cropRow = new LinkedList<Crop>();

    public void plant(Crop crop){
        cropRow.add(crop);
    }
    public int size(){
        return cropRow.size();
    }

    public CropRow() {}
}
