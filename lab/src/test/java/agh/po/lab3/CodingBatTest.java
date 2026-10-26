package agh.po.lab3;

import static org.junit.Assert.*;

public class CodingBatTest {

    @org.junit.Test
    public void bigDiff() {
        assertEquals(8,CodingBat.bigDiff(new int[]{2,4,6,8,10}));
        assertEquals(300,CodingBat.bigDiff(new int[]{220,400,100,250,310}));
        assertEquals(80,CodingBat.bigDiff(new int[]{14,7,12,81,1}));
        assertEquals(10,CodingBat.bigDiff(new int[]{0,10}));
        assertEquals(92,CodingBat.bigDiff(new int[]{13,21,100,8,14,22}));

    }

    @org.junit.Test
    public void countEvens() {
        assertEquals(4,CodingBat.countEvens(new int[]{4,6,8,10}));
    }

    @org.junit.Test
    public void centeredAverage(){
        assertEquals(2,CodingBat.countEvens(new int[]{1,2,3}),0.0001f);
    }
}