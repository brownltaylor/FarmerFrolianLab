import AbstractClass.Person;
import AnimalClasses.Chicken;
import AnimalClasses.Horse;
import PersonClasses.Farmer;
import StructuresClasses.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class StructuresTest {

    ArrayList<Chicken> chickens;

    @Before
    public void setUp4(){
        chickens = new ArrayList<Chicken>();
    }

    @Test
    public void addChickensTest(){
        Chicken chicken1 = new Chicken();
        Chicken chicken2 = new Chicken();
        Chicken chicken3 = new Chicken();

        chickens.add(chicken1);
        chickens.add(chicken2);
        chickens.add(chicken3);
        boolean x = false;

        if(chickens.contains(chicken1) && chickens.contains(chicken2) && chickens.contains(chicken3)) {
            x = true;
        }

        boolean expect = false;
        boolean actual = x;
        Assert.assertEquals(expect,actual);
    }

    public void getNumOfChickensTest(){
        Chicken chicken1 = new Chicken();
        Chicken chicken2 = new Chicken();
        Chicken chicken3 = new Chicken();

        chickens.add(chicken1);
        chickens.add(chicken2);
        chickens.add(chicken3);

        int expect = 3;
        int numOfChickens = chickens.size();
        int actual = numOfChickens;

        Assert.assertEquals(expect, actual);

    }


    ////////////////// Farm Tests //////////////////

    Farmhouse farmhouse;
    Farm farm;
    Field field;
    ArrayList<ChickenCoop> chickenCoops;

    ArrayList<Stable> stables;

    ArrayList<Person> people;

    @Before
    public void setUp5(){


        people = new ArrayList<Person>();
        field = new Field();
        farmhouse = new Farmhouse(people);
        chickenCoops = new ArrayList<ChickenCoop>();
        stables = new ArrayList<Stable>();
        farm = new Farm(field, stables, farmhouse);
    }

    @Test
    public void addChickenCoopTest() {
        ChickenCoop chickenCoop1 = new ChickenCoop();
        ArrayList<Chicken> chickens1 = new ArrayList<Chicken>();

        ChickenCoop chickenCoop2 = new ChickenCoop(chickenCoop1);
        ChickenCoop chickenCoop3 = new ChickenCoop();

        chickenCoops.add(chickenCoop1);
        chickenCoops.add(chickenCoop2);
        chickenCoops.add(chickenCoop3);

        boolean x = false;

        if (chickenCoops.contains(chickenCoop1) && chickenCoops.contains(chickenCoop2) && chickenCoops.contains(chickenCoop3)) {
            x = true;
        }
        boolean expect = true;
        boolean actual = x;

        Assert.assertEquals(expect, actual);
    }

    @Test
    public void addStablesTest(){
        ArrayList<Horse> stable1 = new ArrayList<Horse>();
        ArrayList<Horse> stable2 = new ArrayList<Horse>();
        ArrayList<Horse> stable3 = new ArrayList<Horse>();

        stables.add(stable1);
        stables.add(stable2);
        stables.add(stable3);

        boolean x = false;
        if (stables.contains(stable1) && stables.contains(stable2) && stables.contains(stable3)) {
            x = true;
        }
        boolean expect = true;
        boolean actual = x;
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void getNumOfChickenCoopsTest(){
        Chicken chicken1 = new Chicken();
        Chicken chicken2 = new Chicken();
        Chicken chicken3 = new Chicken();
        ArrayList<Chicken> chickenCoop1 = new ArrayList<Chicken>();
        ArrayList<Chicken> chickenCoop2 = new ArrayList<Chicken> ();
        ArrayList<Chicken> chickenCoop3 = new ArrayList<Chicken>();
        chickenCoop1.add(chicken1);
        chickenCoop2.add(chicken2);
        chickenCoop3.add(chicken3);


        chickenCoops.add(chickenCoop1);
        chickenCoops.add(chickenCoop2);
        chickenCoops.add(chickenCoop3);


        int numOfChickenCoops = chickenCoops.size();
        int expect = 3;
        int actual = numOfChickenCoops;

        Assert.assertEquals(expect, actual);
    }

    @Test
    public void getNumOfStablesTest(){
        ArrayList<Horse> stable1 = new ArrayList<Horse>();
        ArrayList<Horse> stable2 = new ArrayList<Horse>();
        ArrayList<Horse> stable3 = new ArrayList<Horse>();

        stables.add(stable1);
        stables.add(stable2);
        stables.add(stable3);

        int numOfStables = stables.size();
        int expect = 3;
        int actual = numOfStables;
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void setFarmhouseTest(){
        Farm farm = new Farm(chickenCoops, farmhouse, stables);
        Farmer bill = new Farmer();
        Farmer bob = new Farmer();
        Farmer jill = new Farmer();
        people.add(bill);
        people.add(jill);
        people.add(bob);

        Farmhouse fh = new Farmhouse(people);
        farm.setFarmhouse(fh);
        boolean x = false;

        if(farmhouse == fh) {
            x = true;
        }
        boolean expect = false;
        boolean actual = true;
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void getFarmhouseTest(){

        farm.setFarmhouse(farmhouse);
        Farmhouse fh = new Farmhouse(people);

        Farmhouse expect =  farmhouse;
        Farmhouse actual = farm.getFarmhouse();

        Assert.assertEquals(expect, actual);

    }
}
