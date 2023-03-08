package com.fabiankevin.designpatterns.behavioral.memento.example2;

import com.fabiankevin.designpatterns.behavioral.memento.Memento;

import java.util.Stack;

public class HumanManager {
    private Stack<Memento> undoStack = new Stack<>();
    private Stack<Memento> redoStack = new Stack<>();

    public void saveState(Undoable undoable) {
        undoStack.push(undoable.save());
        redoStack.clear();
    }

    public void undo(Undoable undoable) {
        if (!undoStack.isEmpty()) {
            Memento memento = undoStack.pop();
            redoStack.push(undoable.save());
            undoable.restore(memento);
        }
    }

    public void redo(Undoable undoable) {
        if (!redoStack.isEmpty()) {
            Memento memento = redoStack.pop();
            undoStack.push(undoable.save());
            undoable.restore(memento);
        }
    }
}
