package FoodClasses;

import AbstractClass.Crop;

public class TomatoPlant extends Crop {

    public String yield(TomatoPlant tomatoPlant) {
        tomatoPlant.setHasBeenHarvested(true);
        Tomato tomato = new Tomato();
        tomato.addCounter();
        int x =tomato.getCounter();
        return "You harvested a corn! and now have : " + x + "Corn!";
    }

    public void plant() {

    }
}
