package com.jasleen.lld.beginner.TextDecorator;

public class SimpleText implements Text {
    private String text;

    public SimpleText(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }
}
