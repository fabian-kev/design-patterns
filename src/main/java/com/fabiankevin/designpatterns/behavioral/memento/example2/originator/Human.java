package com.fabiankevin.designpatterns.behavioral.memento.example2.originator;

import com.fabiankevin.designpatterns.behavioral.memento.Memento;
import com.fabiankevin.designpatterns.behavioral.memento.example2.Undoable;

public class Human implements Undoable {
    private String decision;

    public void decide(String decision){
        this.decision = decision;
    }

    public String getDecision(){
        return this.decision;
    }

    public Memento save() {
        return new Memento(decision);
    }

    public void restore(Memento memento) {
        this.decision = memento.getState();
    }
}
