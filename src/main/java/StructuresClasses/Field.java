package StructuresClasses;

import AbstractClass.Crop;
import FoodClasses.CropRow;

import java.util.LinkedList;


public class Field {
    private LinkedList<CropRow> cropRows;
    private int numOfCropRows = cropRows.size();

    public Field(LinkedList<CropRow> cropRows){
        this.cropRows = cropRows;
    }
    public Field(){
    }
    public void setField(LinkedList<CropRow> cropRows1){
        cropRows = cropRows1;
    }
    public LinkedList<CropRow> getCropRows(){
        return cropRows;
    }
    public void addCropRow(CropRow cropRow){
        cropRows.add(cropRow);
    }
    public int getNumOfCropRows(){
        return numOfCropRows;
    }

}
