package org.example.nio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;

public class CopyBinaryLong {
    public static void copyBinaryLong(String src, String dst) throws IOException {
        BufferedReader bufferedReader = Files.newBufferedReader(Paths.get(src), StandardCharsets.UTF_8);
        while (true){
            char[] array = new char[2048];
            int ret = bufferedReader.read(array, 0, 2048);
            if (ret <= 0) break;

            Files.write(Paths.get(dst), charToByte(array, ret));
        }
    }

    private static byte[] charToByte(char[] array, int pos) {
        byte [] ret = new byte[pos];
        for (int i = 0; i < pos; i++){
            ret[i] = (byte) array[i];
        }
        return ret;
    }

    public static void main(String[] args) throws IOException {
        copyBinaryLong("C:\\Users\\Studi\\Desktop\\Product_Quote\\test.txt", "C:\\Users\\Studi\\Desktop\\Product_Quote\\copy.txt");
    }
}
