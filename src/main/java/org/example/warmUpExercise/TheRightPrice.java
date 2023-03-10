package org.example.warmUpExercise;

import java.util.Scanner;
import java.util.random.RandomGenerator;

/**
 *  Takes two guesses and select the closest to random number [0-100]
 */
public class TheRightPrice {
    public static void main(String[] args) {
        RandomGenerator rand = RandomGenerator.getDefault();
        int number = rand.nextInt(101);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Player 1 insert your guess:\t");
        int player1 = scanner.nextInt();
        System.out.print("Player 2 insert your guess:\t");
        int player2 = scanner.nextInt();
        if(Math.abs(number - player1) < Math.abs(number - player2)){
            System.out.print("The random number was " + number + " Player 1 won");
        }
        else{
            System.out.print("The random number was " + number + " Player 2 won");
        }
    }
}