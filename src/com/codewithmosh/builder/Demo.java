package com.codewithmosh.builder;

import java.io.IOException;

public class Demo {
    public static void show() throws IOException {
        var document = new Document();
        document.add(new Text("Hello World"));
        document.add(new Image("pic1.jpg"));

        var htmlBuilder = new HtmlDocumentBuilder();

        document.export(htmlBuilder, "export.html");

        var textBuilder = new TextDocumentBuilder();

        // Only writes the text elements to the file
        document.export(textBuilder, "export.txt");
    }
}
