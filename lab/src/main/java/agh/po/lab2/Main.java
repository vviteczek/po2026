package main.java.agh.po.lab2;

import agh.po.lab1.Choinka;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> liczby = new ArrayList<>();
        for(int i = 0; i < args.length; i++)
        {
            int liczba = Integer.parseInt(args[i]);
            liczby.add(liczba);
        }
        Lotto.Losowanie(liczby);
    }
}
