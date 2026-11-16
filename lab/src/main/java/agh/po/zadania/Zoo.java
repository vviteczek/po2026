package agh.po.zadania;
import agh.po.animals.*;
import java.util.Random;

public class Zoo {
    Animal[] animals = new Animal[100];
    Random rand = new Random();
    public Zoo()
    {
        for(int i = 0; i < animals.length; i++)
        {
            int type = rand.nextInt(3);
            if(type == 1)
            {
                animals[i] = new Parrot("papuga" + i+1);
            }
            else if(type == 2)
            {
                animals[i] = new Dog("Pies" + i+1);
            }
            else {
                animals[i] = new Snake("Wonsz" + i+1);
            }
        }
    }
    public int ilosc_stup()
    {
        int iloscstup = 0;
        for(Animal a : animals)
        {
            iloscstup += a.GetLegs();
        }
        return iloscstup;
    }
    public void wypiszzwieszenta()
    {
        for(Animal a : animals)
        {
            System.out.println(a.GetDescription());
        }
    }

}
