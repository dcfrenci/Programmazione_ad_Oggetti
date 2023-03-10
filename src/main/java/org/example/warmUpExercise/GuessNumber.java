package org.example.warmUpExercise;

import java.util.Scanner;
import java.util.random.RandomGenerator;

public class GuessNumber {
    //select a number (1-3). If the computer choose the same number you win
    public static void main(String[] args) {
        RandomGenerator rand = RandomGenerator.getDefault();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Guess a number between 1 and 3: \t");
            int answer = scanner.nextInt();
            if (rand.nextInt(0, 4) == answer){
                System.out.print("Your guess was correct");
                break;
            }
        }
    }
}