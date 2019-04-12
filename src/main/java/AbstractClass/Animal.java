package AbstractClass;

import Interfaces.Eater;
import Interfaces.Edible;
import Interfaces.NoiseMaker;

public abstract class Animal implements NoiseMaker, Eater {

    public String eat(Edible edible) {
        String eat = eat(edible);
        return eat;
    }

    public String makeNoise(NoiseMaker noise) {
        String noise1= makeNoise(noise);
        return noise1;
    }

    public Animal(){

   }


}
