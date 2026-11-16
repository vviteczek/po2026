package agh.po.animals;

public class Dog extends Animal{
    public Dog(String name)
    {
        super( name ,4);
    }


    public String GetDescription()
    {
        return "Dog, 4 legs";
    }
}
