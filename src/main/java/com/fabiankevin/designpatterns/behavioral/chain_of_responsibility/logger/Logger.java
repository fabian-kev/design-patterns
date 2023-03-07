package com.fabiankevin.designpatterns.behavioral.chain_of_responsibility.logger;

public abstract class Logger {
    public static int INFO = 1;
    public static int ERROR = 3;
    public static int DEBUG = 2;
    protected int levels;

    private Logger nextLogger;

    public Logger(int levels) {
        this.levels = levels;
    }

    public void setNextLogger(Logger logger){
        this.nextLogger = logger;
    }

    public void log(int level, String message) {
        if(this.levels <= level){
            logMessage(message);
        }
        if(nextLogger != null){
            nextLogger.log(level, message);
        }
    }

    public abstract void logMessage(String message);
}
