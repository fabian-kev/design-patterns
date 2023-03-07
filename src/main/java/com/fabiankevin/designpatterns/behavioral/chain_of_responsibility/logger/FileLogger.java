package com.fabiankevin.designpatterns.behavioral.chain_of_responsibility.logger;

public class FileLogger extends Logger {

    public FileLogger(int levels) {
        super(levels);
    }

    @Override
    public void logMessage(String message) {
        System.out.println(this.levels+": File Logger: "+message);
    }
}
