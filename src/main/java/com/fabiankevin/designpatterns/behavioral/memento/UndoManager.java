package com.fabiankevin.designpatterns.behavioral.memento;

import com.fabiankevin.designpatterns.behavioral.memento.originator.TextEditor;

import java.util.Stack;

public class UndoManager {
    private Stack<Memento> undoStack = new Stack<>();
    private Stack<Memento> redoStack = new Stack<>();

    public void saveState(TextEditor editor) {
        undoStack.push(editor.save());
        redoStack.clear();
    }

    public void undo(TextEditor editor) {
        if (!undoStack.isEmpty()) {
            Memento memento = undoStack.pop();
            redoStack.push(editor.save());
            editor.restore(memento);
        }
    }

    public void redo(TextEditor editor) {
        if (!redoStack.isEmpty()) {
            Memento memento = redoStack.pop();
            undoStack.push(editor.save());
            editor.restore(memento);
        }
    }
}
