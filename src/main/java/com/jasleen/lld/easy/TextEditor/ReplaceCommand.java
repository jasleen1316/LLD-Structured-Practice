package com.jasleen.lld.easy.TextEditor;

public class ReplaceCommand implements Command{
    Document document;
    int position;
    int length;
    String text;

    public ReplaceCommand(Document document, int position, int length, String text) {
    }

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
