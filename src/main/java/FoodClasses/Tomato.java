package FoodClasses;

import Interfaces.Edible;

public class Tomato extends TomatoPlant implements Edible {
    private int counter;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
