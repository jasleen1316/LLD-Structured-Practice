package com.jasleen.lld.easy.TextEditor;

public class Document {

    private StringBuilder stringBuilder = new StringBuilder();

    public void insertText(int position, String text){
        stringBuilder.insert(position, text);
    }

    public void removeText(int position, int length){
        stringBuilder.delete(position, position+length);
    }

    public String getContent(){
        return stringBuilder.toString();
    }
}
