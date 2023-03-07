package com.fabiankevin.designpatterns.behavioral.command.invoker;

import com.fabiankevin.designpatterns.behavioral.command.commands.Command;

public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton(){
        this.command.execute();
    }
}
