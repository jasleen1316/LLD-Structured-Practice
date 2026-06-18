package com.jasleen.lld.easy.TextEditor;

public class RemoveCommand implements Command{
    Document document;
    int position;
    int length;

    public RemoveCommand(Document document, int position, int length) {
        this.document = document;
        this.length = length;
        this.position = position;
    }

    @Override
    public void execute() {
        document.removeText(length, position);
    }

    @Override
    public void undo() {

    }
}
