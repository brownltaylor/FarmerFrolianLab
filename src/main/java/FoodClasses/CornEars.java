package FoodClasses;

import AbstractClass.Crop;
import Interfaces.Edible;

public class CornEars extends CornStalk implements Edible {
    private int counter;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
