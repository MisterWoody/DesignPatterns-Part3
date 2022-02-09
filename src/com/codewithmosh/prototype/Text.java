package com.codewithmosh.prototype;

public class Text implements Component {
    private String content;

    public Text(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public Component clone() {
        System.out.println("Duplicating text component");
        return new Text(content);
    }
}
