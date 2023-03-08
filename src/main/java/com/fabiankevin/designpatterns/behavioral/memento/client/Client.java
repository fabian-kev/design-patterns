package com.fabiankevin.designpatterns.behavioral.memento.client;

import com.fabiankevin.designpatterns.behavioral.memento.UndoManager;
import com.fabiankevin.designpatterns.behavioral.memento.originator.TextEditor;

public class Client {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        UndoManager undoManager = new UndoManager();

        editor.setText("Hello, world!");
        undoManager.saveState(editor);

        editor.setText("Goodbye, world!");
        undoManager.saveState(editor);

        System.out.println("Current " + editor.getText());
        undoManager.undo(editor); // undoes "Goodbye, world!" change
        System.out.println("First undo "+editor.getText());
        undoManager.undo(editor); // undoes "Hello, world!" change
        System.out.println("Second undo "+editor.getText());

        undoManager.redo(editor); // redoes "Hello, world!" change
        undoManager.redo(editor); // redoes "Goodbye, world!" change
    }
}