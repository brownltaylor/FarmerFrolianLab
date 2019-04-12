package FoodClasses;

import AbstractClass.Crop;

public class TomatoPlant extends Crop {

    public String yield(TomatoPlant tomatoPlant {
        tomatoPlant.setHasBeenHarvested(true);
        Tomato tomato = new Tomato();
        int x = tomato.getCounter() + 1;
        tomato.setCounter(x);
        return "You harvested a corn! and now have : " + x + "Corn!";
    }

    public void plant() {

    }
}
