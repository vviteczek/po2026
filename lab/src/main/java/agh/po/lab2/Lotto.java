package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;

public class Lotto {
    public static void Losowanie(ArrayList<Integer> strzaly) {
        ArrayList<Integer> lista = new ArrayList<>();
        Random liczba = new Random();
        System.out.println(strzaly);
        for (int i = 0; i < 7; i++)
        {

            boolean czyjest = true;
            while(czyjest)
            {
                int wylosowana = liczba.nextInt(50);
                if(!lista.contains(wylosowana)){
                    lista.add(wylosowana);
                    czyjest = false;
                }
            }
        }
        System.out.println(lista);
        int trafienia = 0;
        for(int i = 0; i < 7; i++)
        {
            int losowe = strzaly.get(i);
            if(lista.contains(losowe)){
                trafienia++;
            }
        }

        boolean prawda = true;
        while(prawda)
        {
            ArrayList<Integer> szustka = new ArrayList<>();
            int test = 0;
            for(int i = 0; i<7;i++)
            {
                boolean czyjest = true;
                while(czyjest)
                {
                    int wylosowana = liczba.nextInt(50);
                    if(!szustka.contains(wylosowana)){
                        szustka.add(wylosowana);
                        czyjest = false;
                    }
                }


            }

            for(int j = 0;j<7;j++ )
            {

                if(lista.contains(szustka.get(j)))
                {
                    test++;
                }
            }
            if(test == 7){
                prawda = false;
                System.out.println("Trafiłes szustke z tablica " + szustka);
            }
        }
        System.out.println(trafienia);
    }

}
