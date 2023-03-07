package com.fabiankevin.designpatterns.structrural.proxy;

public class PageProxy implements Page {
    private final String url;
    private PageImpl pageImpl;


    public PageProxy(String url) {
        this.url = url;
    }
    
    @Override
    public void display() {
        if(pageImpl == null){
            pageImpl = new PageImpl(url);
        }
        pageImpl.display();
    }
}