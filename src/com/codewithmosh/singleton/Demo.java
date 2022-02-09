package com.codewithmosh.singleton;

public class Demo {
    public static void show() {
        var logger = Logger.getInstance("LogFile.txt");
        System.out.println("Logging using the singleton pattern");

        var logger2 = Logger.getInstance("LogFile1.txt");
        var logger3 = Logger.getInstance("LogFile1.txt");

        System.out.println(logger == logger2);
        System.out.println(logger3 == logger2);
    }
}
