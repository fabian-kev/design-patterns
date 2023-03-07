package com.fabiankevin.designpatterns.behavioral.chain_of_responsibility.logger;

public class ConsoleLogger extends Logger {

    public ConsoleLogger(int levels) {
        super(levels);
    }

    @Override
    public void logMessage(String message) {
        System.out.println(this.levels+": Console Logger: "+message);
    }
}
