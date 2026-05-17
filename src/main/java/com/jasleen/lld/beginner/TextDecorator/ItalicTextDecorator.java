package com.jasleen.lld.beginner.TextDecorator;

public class ItalicTextDecorator implements TextDecorator {

    Text text;
    
    public ItalicTextDecorator(Text text) {
        this.text = text;
    }
    
    @Override
    public String decorate(String text) {
        return "<i>" + text + "</i>";
    }

    @Override
    public String getText() {
        return decorate(text.getText());
    }
}
