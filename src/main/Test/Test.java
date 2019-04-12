import FoodClasses.CornStalk;
import FoodClasses.CropRow;
import FoodClasses.Tomato;
import FoodClasses.TomatoPlant;
import org.junit.Assert;

public class Test {

    @org.junit.Test
    public void cropRowTest(){
        CornStalk corn1 = new CornStalk();
        CornStalk corn2 = new CornStalk();
        CornStalk corn3 = new CornStalk();
        CropRow cropRow = new CropRow();
        cropRow.plant(corn1);
        cropRow.plant(corn2);
        cropRow.plant(corn3);
        int expect = 3;
        int actual = cropRow.size();

        Assert.assertEquals(expect,actual);
    }
    @org.junit.Test
    public void yieldTest(){
        CropRow cropRow = new CropRow();
        Tomato tomato = new Tomato();
        TomatoPlant tomatoPlant = new TomatoPlant();
        cropRow.plant(tomato);
        tomato.yield(tomatoPlant);
        String expected = "You harvested a corn! and now have : 2Corn!";
        String actual = tomato.yield(tomatoPlant);

        Assert.assertEquals(expected,actual);
    }
    public void cornTest(){

    }
}
