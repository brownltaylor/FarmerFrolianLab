package AbstractClass;


public abstract class Crop {

    private boolean hasBeenHarvested;

    public abstract void plant();

    public void setHasBeenHarvested(boolean boo){
        hasBeenHarvested = boo;
        }
    }

