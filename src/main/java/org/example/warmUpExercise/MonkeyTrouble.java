package org.example.warmUpExercise;

import java.util.Scanner;

public class MonkeyTrouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Is the first monkey smiling? (true/false)\t");
        boolean monkeyOne = scanner.nextBoolean();
        System.out.print("Is the second monkey smiling? (true/false)\t");
        boolean monkeyTwo = scanner.nextBoolean();
        if(monkeyOne == monkeyTwo){
            System.out.print("It's time to run!!");
        }
    }
}
