package com.fabiankevin.designpatterns.behavioral.memento.example2;

import com.fabiankevin.designpatterns.behavioral.memento.Memento;

public interface Restorable {
    void restore(Memento memento);
}
