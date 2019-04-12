package StructuresClasses;

import AnimalClasses.Horse;

import java.util.ArrayList;

public class Stable {

    ArrayList<Horse> horses;
    private int numOfHorses = horses.size();

    public Stable(ArrayList<Horse> horses){
        this.horses = horses;
    }
    public Stable(){
    }
    public void addHorse(Horse horse){
        horses.add(horse);
    }
    public void setHorses(ArrayList<Horse> horses1){ horses = horses1;}
    public ArrayList<Horse> getHorses(){ return horses;}
    public int getNumOfHorses(){
        return numOfHorses;
    }



}
