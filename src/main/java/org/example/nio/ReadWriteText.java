package org.example.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadWriteText {
    public static List<String> readTextFile(String filename) throws IOException {
        return Files.readAllLines(Paths.get(filename));
    }

    public static <T extends CharSequence> void writeTextFile(String filename, List<T> lines) throws IOException {
        Files.write(Paths.get(filename), lines);
    }
}
