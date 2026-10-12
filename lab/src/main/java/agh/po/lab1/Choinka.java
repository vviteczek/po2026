package agh.po.lab1;

import java.util.Scanner;

public class Choinka {

    public static void printChoinka() {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Wysokość choinki");

        int wysokosc = myObj.nextInt();

        for(int i=0; i < wysokosc; i++){
            for(int j = 0; j<=i;j++){
                System.out.print('*');
            }
                System.out.println();
        }


    }


}
