package com.fabiankevin.designpatterns.behavioral.memento.originator;

import com.fabiankevin.designpatterns.behavioral.memento.Memento;

public class TextEditor {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public Memento save() {
        return new Memento(text);
    }

    public void restore(Memento memento) {
        this.text = memento.getState();
    }
}