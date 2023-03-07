package com.fabiankevin.designpatterns.behavioral.template;

public abstract class ReportTemplate {
    public void generate(){
        addBody();
        addBody();
        addFooter();
    }
    protected abstract void addHeader();
    protected abstract void addBody();
    protected abstract void addFooter();
}
