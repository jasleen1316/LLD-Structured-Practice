package com.jasleen.lld.easy.TextEditor;

public class TextEditor {

    public Document document = new Document();
    public HistoryManager historyManager;

    public TextEditor(int maxHistory){
        this.historyManager = new HistoryManager(maxHistory);
    }

    public void addText(int position, String text){
        historyManager.executeCommand(new InsertCommand(document, position, text));
    }

    void removeText(int position, int length){
        historyManager.executeCommand(new RemoveCommand(document, position, length));
    }

    void replaceText(int position, int length, String text){
        historyManager.executeCommand(new ReplaceCommand(document, position, length, text));
    }

    void undo(){

    }

    void redo(){

    }
}
