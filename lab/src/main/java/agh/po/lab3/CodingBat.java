package agh.po.lab3;

public class CodingBat {

    public static int centeredAverage(int[] nums) {

        int dlugosc = nums.length;
        int suma = 0;
        for(int i = 0; i < nums.length; i++)
        {
            suma += nums[i];
        }
        int end = suma/dlugosc;
        return end;
    }
    public static int bigDiff(int[] nums) {
        int max = 0;
        int min = 10000;
        for(int i = 0; i < nums.length; i++)
        {
            if (nums[i] > max){
                max = nums[i];
            }

            if(nums[i] < min)
            {
                min = nums[i];
            }
        }
        int wynik = max - min;
        return wynik;
    }
    public static int countEvens(int[] nums) {
        int parzyste = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] % 2 == 0)
            {
                parzyste++;
            }
        }
        return parzyste;
    }
    public static void main(String[] args)
    {
        int[] numerki = {1,2,3};
        System.out.println(countEvens(numerki));
        System.out.println(centeredAverage(numerki));
    }
}
