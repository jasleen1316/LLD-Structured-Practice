package com.jasleen.lld.easy.TextEditor;

public class InsertCommand implements Command{
    Document document;
    String text;
    int position;

    public InsertCommand(Document document, int position, String text) {
        this.document = document;
        this.text = text;
        this.position = position;
    }

    @Override
    public void execute() {
        document.insertText(position, text);
    }

    @Override
    public void undo() {

    }
}
