package FoodClasses;

import Interfaces.Edible;

public class Tomato extends TomatoPlant implements Edible {
    public static int tomatoCounter;

    public int getCounter() {
        return tomatoCounter;
    }
    public void addCounter(){
        tomatoCounter = tomatoCounter + 1;
    }
}
