package com.codewithmosh.builder;

public class TextDocumentBuilder implements DocumentBuilder {
    private StringBuilder builder = new StringBuilder();

    @Override
    public void addText(Text text) {
        builder.append(text.getContent());
    }

    @Override
    public void addImage(Image image) {
        // Images do not get added to text output, so there's no implementation here
    }

    @Override
    public String getResult() {
        return builder.toString();
    }
}
