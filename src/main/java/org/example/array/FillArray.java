package org.example.array;

import java.util.Arrays;
import java.util.random.RandomGenerator;

public class FillArray {
    public static double[] fillArray(int size, int value, boolean randomize){
        double[] arr = new double[size];
        if(randomize){
            RandomGenerator rand = RandomGenerator.getDefault();
            for(int i = 0; i < size; i++){
                arr[i] = value + rand.nextDouble(-0.5, 0.51);
            }
        }
        else{
            Arrays.fill(arr, value);
        }
        return arr;
    }
}
