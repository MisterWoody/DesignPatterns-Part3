package com.codewithmosh.singleton;

public class Demo {
    public static void show() {
        var logger = new Logger("LogFile.txt");
        System.out.println("Logging using the singleton pattern");

        var logger2 = new Logger("LogFile.txt");
    }
}
