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
        cornStalk.setHasBeenHarvested(true);
        CornEars corn1 = new CornEars();
        int x = corn1.getCounter() + 1;
        corn1.setCounter(x);
        return "You harvested a corn! and now have : " + x + "Corn!";
    }
}
