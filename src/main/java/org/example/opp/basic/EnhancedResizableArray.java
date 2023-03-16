package org.example.opp.basic;

import com.sun.jdi.ArrayReference;

import java.util.ArrayList;
import java.util.Arrays;

public class EnhancedResizableArray {
    int []v;

    public EnhancedResizableArray(int[] v) {
        this.v = v;
    }
    public void add(int value){
        this.v = Arrays.copyOf(v, this.v.length + 1);
        this.v[v.length - 1] = value;
    }
    public void remove(int index){
        int[] newV = new int[v.length - 1];
        int pos = 0;
        for(int i = 0; i < v.length; i++){
            if(i != index){
                newV[pos] = v[i];
                pos++;
            }
        }
        this.v = newV;
    }
    public void set(int index, int value){
        this.v[index] = value;
    }
    public boolean contains(int value){
        return Arrays.binarySearch(v, value) >= 0;
    }
    public int size(){
        return v.length;
    }
    public int[] toArray(){
        return Arrays.copyOf(v, v.length);
    }
}
