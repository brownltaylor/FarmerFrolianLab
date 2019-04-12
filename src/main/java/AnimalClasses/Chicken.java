package AnimalClasses;

import Interfaces.Edible;
import Interfaces.NoiseMaker;
import Interfaces.Produce;
import java.util.ArrayList;
import java.util.List;

public class Chicken implements Produce {

    boolean hasFertalized;
    public String noise;
    private Edible edible;


    public void yield(boolean isFertilized) {

    }

    // Animal is a NoiseMaker and Eater
    // Horse is an Animal and Rideable
    // Chicken is an Animal and a Produce which yield an EdibleEgg if hasBeenFertilized flag is false.


    List<Edible> foodEaten = new ArrayList<Edible>();

    private boolean hasFertilized() {
        return true;
    }

    public Boolean yield() throws Exception {
        if (hasFertilized() != hasFertalized) {
            throw new Exception("This chicken has been fertilized and it doesn't produce edible eggs.");
        } else {

            return true;
        }
    }



    public void eat() {
        foodEaten.add( edible);
    }

    public void NoiseMaker(NoiseMaker sound) {

        noise = sound.toString();
    }


    public List<Edible> getFoodEaten() {
        return foodEaten;
    }


    public String makeNoise() {
        return "Cluck-cluck-cluck!";
    }

    public static List<Chicken> makeChickens(int numberOfChickens) {
        List<Chicken> chickens = new ArrayList<Chicken>();
        for (int i = 0; i < numberOfChickens; i++) {
            chickens.add(new Chicken());
        }
        return chickens;
    }










}
