package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
    public static void Losowanie() {
        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> strzaly = new ArrayList<>();
        Random liczba = new Random();
        Scanner wczytane = new Scanner(System.in);
        for(int i = 1; i < 8; i++)
        {
            System.out.print("Podaj " + i + " Liczbe");
            int strzal = wczytane.nextInt();
            strzaly.add(strzal);
        }
        System.out.println(strzaly);
        for (int i = 0; i < 7; i++)
        {
            lista.add(liczba.nextInt(50));

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
        System.out.println(trafienia);
    }

}
