package com.fabiankevin.designpatterns.behavioral.command;

import com.fabiankevin.designpatterns.behavioral.command.commands.Command;
import com.fabiankevin.designpatterns.behavioral.command.commands.TvChangeChannel;
import com.fabiankevin.designpatterns.behavioral.command.commands.TvTurnOff;
import com.fabiankevin.designpatterns.behavioral.command.commands.TvTurnOn;
import com.fabiankevin.designpatterns.behavioral.command.invoker.RemoteControl;
import com.fabiankevin.designpatterns.behavioral.command.receiver.TV;

public class CommandApp {
    public static void main(String[] args) {
        TV tv = new TV();

        Command turnOn = new TvTurnOn(tv);
        Command turnOff = new TvTurnOff(tv);
        Command changeChannel = new TvChangeChannel(tv, 5);

        RemoteControl control = new RemoteControl();

        control.setCommand(turnOn);
        control.pressButton();

        control.setCommand(changeChannel);
        control.pressButton();

        control.setCommand(turnOff);
        control.pressButton();


    }
}
