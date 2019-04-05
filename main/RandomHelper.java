package main;

import java.util.Random;

public class RandomHelper {

    public static boolean getBigchance(){
        Random rn = new Random();
        return rn.nextDouble()<0.9;
    }
    public static int getInt(int lower, int upper){
        Random rn = new Random();
        return lower + rn.nextInt(upper - lower +1);
    }
}
