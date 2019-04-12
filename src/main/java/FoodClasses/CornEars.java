package FoodClasses;

import AbstractClass.Crop;
import Interfaces.Edible;

public class CornEars extends CornStalk implements Edible {
    public static int cornCounter;

    public int getCounter() {
        return cornCounter;
    }
    public void addCounter(){
        cornCounter = cornCounter + 1;
    }
}
}
