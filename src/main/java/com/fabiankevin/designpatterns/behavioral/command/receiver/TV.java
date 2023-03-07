package com.fabiankevin.designpatterns.behavioral.command.receiver;

public class TV {
    private boolean isOn;
    private int currentChannel;

    public void turnOn() {
        isOn = true;
        System.out.println("Tv is turned on");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Tv is turned off");
    }

    public void changeChannel(int channel) {
        currentChannel = channel;
        System.out.println("Channel is changed to "+channel);

    }
}