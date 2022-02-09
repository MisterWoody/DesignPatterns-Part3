package com.codewithmosh.factory;

public class Demo {
    public static void show() {
        var scheduler = new Scheduler();
        scheduler.schedule(new Event());

        // Arabian scheduler using an Arabian calendar
        var arabianScheduler = new ArabianScheduler();
        arabianScheduler.schedule(new Event());
    }
}
