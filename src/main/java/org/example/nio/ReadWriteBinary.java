package org.example.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadWriteBinary {
    public static byte[] readBinaryFile(String filename) throws IOException{
        return Files.readAllBytes(Paths.get(filename));
    }
    public static void writeBinaryFile(String filename, byte[] bytes) throws IOException {
        Files.write(Paths.get(filename), bytes);
    }
}
