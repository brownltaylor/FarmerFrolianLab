package FoodClasses;

import AbstractClass.Crop;

public class CornStalk extends Crop {
    public void plant() {

    }

    public CornEars grow() {
        return new CornEars();
    }

    public void setHasBeenHarvested(boolean boo) {
    }


    public String yield(CornStalk cornStalk) {
        tomatoPlant.setHasBeenHarvested(true);
        CornEars cornEars = new CornEars();
        cornEars.addCounter();
        int x =tomato.getCounter();
        return "You harvested a corn! and now have : " + x + "Corn!";
    }
}
