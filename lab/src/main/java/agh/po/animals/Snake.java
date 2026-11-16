package agh.po.animals;

public class Snake extends Animal{
    public Snake(String name)
    {
        super(name,2);
    }


    public String GetDescription()
    {
        return "Snake, 0 legs";
    }
}
