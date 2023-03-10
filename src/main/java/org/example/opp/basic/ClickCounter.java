package org.example.opp.basic;

public class ClickCounter {
    int value = 0;
    public int getValue(){
        return value;
    }
    public void click(){
        value++;
    }
    public void undo(){
        if(value - 1 >= 0){
            value--;
        }
    }
    public void reset(){
        value = 0;
    }
}
