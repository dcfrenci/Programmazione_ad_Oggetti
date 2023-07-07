package org.example.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileCreateDelete {
    public static void createFile(String src) throws IOException {
        Files.createFile(Paths.get(src));
    }
    public static void deleteFile(String src) throws IOException {
        Files.delete(Paths.get(src));
    }
}
