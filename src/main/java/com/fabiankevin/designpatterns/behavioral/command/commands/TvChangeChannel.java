package com.fabiankevin.designpatterns.behavioral.command.commands;

import com.fabiankevin.designpatterns.behavioral.command.receiver.TV;

public class TvChangeChannel implements Command {
    private final TV tv;
    private final int channel;
    public TvChangeChannel(TV tv, int channel) {
        this.tv = tv;
        this.channel = channel;
    }

    @Override
    public void execute() {
        tv.changeChannel(channel);
    }
}
