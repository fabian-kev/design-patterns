package com.fabiankevin.designpatterns.behavioral.command.commands;

import com.fabiankevin.designpatterns.behavioral.command.receiver.TV;

public class TvTurnOff implements Command {
    private final TV tv;

    public TvTurnOff(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOff();
    }
}
