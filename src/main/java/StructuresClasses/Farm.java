package StructuresClasses;

import java.util.ArrayList;

public class Farm {

    private Field field;
    private ArrayList<Stable> stables;
    private Farmhouse farmhouse;
    public Farm(Field field, ArrayList<Stable> stables, Farmhouse farmhouse){
        this.field = field;
        this.stables = stables;
        this.farmhouse = farmhouse;
    }
    public void setField(Field f){ field = f; }
    public Field getField(){ return field; }
    public void addStable(Stable stable){ stables.add(stable);}
    public void setStables(ArrayList<Stable> stables1){ stables = stables1; }
    public ArrayList<Stable> getStables(){ return stables; }
    public void setFarmhouse(Farmhouse f){ farmhouse = f; }
    public Farmhouse getFarmhouse(){ return farmhouse; }


}
