package AnimalClasses;

import Interfaces.Edible;
import Interfaces.NoiseMaker;

import java.util.List;

public class Horse {


    // Animal is a NoiseMaker and Eater
    // Horse is an Animal and Rideable
    // Chicken is an Animal and a Produce which yield an EdibleEgg if hasBeenFertilized flag is false.


    public List<Edible> stomach;
    public String noise;


    public Horse(){

    } // DEFAULT CONSTRUCTOR

    public Horse(List<Edible> eatin)
    {
        stomach = eatin;
    } // CONSTRUCTOR (takes in a collection that it can eat)

    public void eat(Edible e) {

        stomach.remove(e);

    }


    public void NoiseMaker(NoiseMaker sound) {

        noise = sound.toString();


    }


    public String makeNoise() {

        return "EEHYYEHHYY";
    }













}
