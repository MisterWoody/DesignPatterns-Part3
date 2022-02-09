package com.codewithmosh.prototype;

public class Demo {
    public static void show() {
        System.out.println("Got to the prototype pattern demo");

        var timeline = new Timeline();
        var text = new Text("Hello");
        timeline.add(text);

        var menu = new ContextMenu(timeline);
        menu.duplicate(text);
    }
}
