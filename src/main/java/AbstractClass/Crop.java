package AbstractClass;

import FoodClasses.CornEars;
import FoodClasses.CornStalk;
import FoodClasses.Tomato;
import FoodClasses.TomatoPlant;

public abstract class Crop {

    private boolean hasBeenHarvested;

    public abstract void plant(Crop crop);

    public abstract void setHasBeenHarvested(boolean harvest);




}
