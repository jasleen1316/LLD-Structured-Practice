package com.jasleen.lld.beginner.TextDecorator;

public class BoldTextDecorator implements TextDecorator {

    Text text;
    
    public BoldTextDecorator(Text text) {
        this.text = text;
    }
    
    @Override
    public String decorate(String text) {
        return "<b>" + text + "</b>";
    }

    @Override
    public String getText() {
        return decorate(text.getText());
    }
}
