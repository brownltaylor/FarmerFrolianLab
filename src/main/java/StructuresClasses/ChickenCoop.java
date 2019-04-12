package StructuresClasses;

import AnimalClasses.Chicken;

import java.util.ArrayList;

public class ChickenCoop {

    private ArrayList<Chicken> chickens;
    private int numOfChickens = chickens.size();

    public ChickenCoop(ArrayList<Chicken> chickens){
        this.chickens = chickens;
    }
    public void addChicken(Chicken chicken){
        chickens.add(chicken);
    }
    public void setChickens(ArrayList<Chicken> chickens1){
        chickens = chickens1;
}
    public ArrayList<Chicken> getChickens(){
        return chickens;
    }
    public int getNumOfChickens(){
        return numOfChickens;
    }
}
