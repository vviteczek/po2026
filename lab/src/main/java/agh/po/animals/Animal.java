package agh.po.animals;

public abstract class Animal     {
    protected String name;
    protected int legs;
    public Animal(String name, int legs){
        this.legs = legs;
        this.name = name;
    }
    public abstract String GetDescription();
    public int GetLegs()
    {
        return legs;
    }
}
