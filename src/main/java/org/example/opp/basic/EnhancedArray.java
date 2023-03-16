package org.example.opp.basic;

import java.util.Arrays;
import java.util.random.RandomGenerator;

public class EnhancedArray {
    int[] v;

    public EnhancedArray(int[] v) {
        this.v = v;
    }
    public int size(){
        return v.length;
    }
    public int get(int index){
        return this.v[index];
    }
    public void set(int index, int value){
        this.v[index] = value;
    }
    public boolean contains(int value){
        for(int elem : v){
            if(elem == value) return true;
        }
        return false;
    }
    public void resetZero(){
        Arrays.fill(this.v, 0);
    }
    public void resetRandom(){
        RandomGenerator rand = RandomGenerator.getDefault();
        for(int elem : v){
            elem = rand.nextInt(0, v.length + 1);
        }
    }
    public int[] toArray(){
        return Arrays.copyOf(this.v, v.length);
    }
}
