package org.example.nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;
import java.util.stream.Collectors;

public class PortableDesktopPath {
    public static String portableDesktopPath() throws IOException {
        return Files.list(Paths.get(System.getProperty("user.home"))).filter(elem -> Files.isDirectory(elem) && elem.toString().contains("Desktop")).map(Path::toString).collect(Collectors.toSet()).toString();
    }

    public static void main(String[] args) throws IOException {
        System.out.println(portableDesktopPath());
    }
}
