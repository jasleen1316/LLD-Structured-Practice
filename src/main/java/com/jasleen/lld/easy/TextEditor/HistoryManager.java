package com.jasleen.lld.easy.TextEditor;

import java.util.ArrayDeque;
import java.util.Deque;

public class HistoryManager {
    int maxHistory;
    Deque<Command> undoStack = new ArrayDeque<>();
    Deque<Command> redoStack = new ArrayDeque<>();

    public HistoryManager(int maxHistory){
        this.maxHistory = maxHistory;
    }

    void executeCommand(Command command){
        command.execute();
        undoStack.add(command);

        if(undoStack.size() > maxHistory){
            undoStack.pollLast();
        }
        redoStack.clear();
    }
    void undo(){

    }
    void redo(){

    }
}
