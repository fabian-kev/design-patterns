package com.fabiankevin.designpatterns.structrural.proxy;

public class PageImpl implements Page {
    private final String url;
    
    public PageImpl(String url) {
        this.url = url;
        loadPageFromServer();
    }
    
    private void loadPageFromServer() {
        // Simulate loading page from server
        try {
            Thread.sleep(2000);
            System.out.println("Page " + url + " loaded from server");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void display() {
        System.out.println("Displaying page " + url);
    }
}

