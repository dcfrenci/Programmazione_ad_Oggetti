package org.example.exception;

import java.io.IOException;

public class RetryWrite {
    public static void main(String[] args) {
        try {
            writeWithTries(3);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void writeWithTries(int maxTries) {
        String message = "Hello World!!";
        for (int i = 0; i < maxTries; i++) {
            try {
                write(message);
                return;
            } catch (IOException ignore) {
            }
        }
    }

    public static void write(String message) throws IOException {
        throw new IOException("Unable to send: " + message);
    }
}