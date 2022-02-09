package com.codewithmosh.singleton;

import java.util.HashMap;
import java.util.Map;

public class Logger {
    private String fileName;
    private static Map<String, Logger> instances = new HashMap<>();

    private Logger(String fileName) {
        this.fileName = fileName;
    }

    public void write(String message) {
        System.out.println("Writing a message to the log.");
    }

    public static Logger getInstance(String filename) {
        if (!instances.containsKey(filename))
            instances.put(filename, new Logger(filename));
        return instances.get(filename);
    }
}
