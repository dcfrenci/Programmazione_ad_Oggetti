package org.example.functional;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Words {
    public static long howManyLines(String filename, String subString) {
        try {
            return Files.newBufferedReader(Paths.get(filename), StandardCharsets.UTF_8).lines().filter(elem -> elem.contains(subString)).count();
        } catch (IOException e){
            return 0;
        }
    }
    public static long howManyTimes(String filename, String word){
        try {
            return Files.newBufferedReader(Paths.get(filename), StandardCharsets.UTF_8).lines().flatMap(line -> Arrays.stream(line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+"))).filter(elem -> elem.equals(word)).count();
        } catch (IOException e){
            return 0;
        }
    }
}
