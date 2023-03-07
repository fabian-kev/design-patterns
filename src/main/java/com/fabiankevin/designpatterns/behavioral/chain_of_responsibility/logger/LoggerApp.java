package com.fabiankevin.designpatterns.behavioral.chain_of_responsibility.logger;

import lombok.extern.java.Log;

public class LoggerApp {

    public static void main(String[] args) {
        Logger info = new ConsoleLogger(Logger.INFO);
        Logger debug = new FileLogger(Logger.DEBUG);
        Logger error = new ErrorLogger(Logger.ERROR);

        info.setNextLogger(debug);
        debug.setNextLogger(error);

//        info.log(Logger.INFO, "information message");
//        info.log(Logger.DEBUG, "debugging message");
        info.log(Logger.ERROR, "error message");
    }
}
