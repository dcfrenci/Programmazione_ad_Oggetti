package org.example.array;

public class FizzBuzz {
    public static String[] fizzBuzz(int start, int end){
        String[] ris = new String[end - start];
        for(int i = 0; i < ris.length; i++){
            if(start % 3 == 0){
                if(start % 5 == 0) ris[i] = "FizzBuzz";
                else ris[i] = "Fizz";
            }
            else if(start % 5 == 0) ris[i] = "Buzz";
            else ris[i] = Integer.toString(start);
            start++;
        }
        return ris;
    }
}
