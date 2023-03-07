package com.fabiankevin.designpatterns.structrural.proxy;

public class PageApp {
    public static void main(String[] args) {
        Browser browser = new Browser();
        browser.openPage("http://www.google.com");
        browser.openPage("http://www.facebook.com");
        browser.openPage("http://www.google.com");
        browser.openPage("http://www.youtube.com");
    }
}
