package main.java.agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;

public class Lotto {
    public static void Losowanie(ArrayList<Integer> strzaly) {
        ArrayList<Integer> lista = new ArrayList<>();
        Random liczba = new Random();
        System.out.println(strzaly);
        for (int i = 0; i < 6; i++)
        {

            boolean czyjest = true;
            while(czyjest)
            {
                int wylosowana = liczba.nextInt(49) + 1;
                if(!lista.contains(wylosowana)){
                    lista.add(wylosowana);
                    czyjest = false;
                }
            }
        }
        System.out.println(lista);
        int trafienia = 0;
        for(int i = 0; i < 6; i++)
        {
            int losowe = strzaly.get(i);
            if(lista.contains(losowe)){
                trafienia++;
            }
        }
        //Losowanie az nie bedzie 6/6

        boolean prawda = true;
        while(prawda)
        {
            int test = 0;
            for(int j = 0;j<6;j++ )
            {

                if(lista.contains(strzaly.get(j)))
                {
                    test++;
                }
            }
            if(test == 6){
                prawda = false;
                System.out.println("Trafiłes szustke z tablica " + lista);
            }
            else
            {
                lista.clear();
                for (int i = 0; i < 6; i++)
                {

                    boolean czyjest = true;
                    while(czyjest)
                    {
                        int wylosowana = liczba.nextInt(49) + 1;
                        if(!lista.contains(wylosowana)){
                            lista.add(wylosowana);
                            czyjest = false;
                        }
                    }
                }
            }
        }
        System.out.println(trafienia);
    }

}
