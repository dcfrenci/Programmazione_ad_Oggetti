package org.example.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadLineNoDelegation {
    public static String readLineNoDelegation(String filename) {
        try (BufferedReader bufferedReader = Files.newBufferedReader(Paths.get(filename), StandardCharsets.UTF_8)){
            return bufferedReader.readLine();
        } catch (IOException e){
            return null;
        }
    }
}
