package org.example.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileList {
    public static Set<String> fileList(String src) throws IOException {
        Path path = Paths.get(src);
        if (Files.isDirectory(path)){
            try (Stream<Path> fileStream = Files.list(path)) {
                return fileStream.filter(element -> !Files.isDirectory(element)).map(Path::toString).collect(Collectors.toSet());
            }
        }
        return null;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(fileList("C:\\Users\\Studi\\Desktop\\Product_Quote"));;
    }
}
