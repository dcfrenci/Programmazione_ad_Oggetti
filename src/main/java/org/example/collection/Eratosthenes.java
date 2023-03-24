package org.example.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Eratosthenes {
    public static Set<Integer> eratosthenes(int n){
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < n + 1; i++){
            numbers.add(i);
        }
        for(int elem = 2; elem < numbers.size(); elem++){
            for(int dop = numbers.size() - 1; dop > elem; dop--){
                if(numbers.get(dop) % numbers.get(elem) == 0) numbers.remove(dop);
            }
        }
        return new LinkedHashSet<>(numbers);
    }
}
