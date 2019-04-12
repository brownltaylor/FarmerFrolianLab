package StructuresClasses;

import AbstractClass.Person;

import java.util.ArrayList;

public class Farmhouse {

    private ArrayList<Person> people;
    private int numOfPeople = people.size();

    public Farmhouse(ArrayList<Person> people){
        this.people = people;
    }

    public void addPerson(Person person){
        people.add(person);
    }
    public void setFarmhouse(ArrayList<Person> people1){ people = people1; }
    public int getNumOfPeople(){
        return numOfPeople;
    }
    public ArrayList<Person> getPeople(){ return people;}

}
