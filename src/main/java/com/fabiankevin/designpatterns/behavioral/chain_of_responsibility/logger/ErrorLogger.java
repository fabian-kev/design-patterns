package com.fabiankevin.designpatterns.behavioral.chain_of_responsibility.logger;

public class ErrorLogger extends Logger {

    public ErrorLogger(int levels) {
        super(levels);
    }

    @Override
    public void logMessage(String message) {
        System.out.println(this.levels+": Error Console Logger: "+message);
    }
}
