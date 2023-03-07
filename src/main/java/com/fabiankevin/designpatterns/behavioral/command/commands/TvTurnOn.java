package com.fabiankevin.designpatterns.behavioral.command.commands;

import com.fabiankevin.designpatterns.behavioral.command.receiver.TV;

public class TvTurnOn implements Command {
    private final TV tv;

    public TvTurnOn(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOn();
    }
}
