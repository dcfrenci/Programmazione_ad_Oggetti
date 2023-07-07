package org.example.nio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CopyTextLong {
    public static void copyTextLong(String src, String dst) throws IOException {
        try (BufferedReader bufferedReader = Files.newBufferedReader(Paths.get(src), StandardCharsets.UTF_8);
                BufferedWriter bufferedWriter = Files.newBufferedWriter(Paths.get(dst), StandardCharsets.UTF_8)) {
            char[] array = new char[1000];
            int ret = 0;
            while ((ret = bufferedReader.read(array, 0, 1000)) > 0){
                bufferedWriter.write(array, 0, ret);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        copyTextLong("C:\\Users\\Studi\\Desktop\\Product_Quote\\test.txt", "C:\\Users\\Studi\\Desktop\\Product_Quote\\copy.txt");
    }
}
