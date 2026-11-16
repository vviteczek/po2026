package agh.po.animals;

public class Parrot extends Animal{
    public Parrot(String name)
    {
        super(name,2);
    }


    public String GetDescription()
    {
        return "Parrot, 2 legs";
    }
}
