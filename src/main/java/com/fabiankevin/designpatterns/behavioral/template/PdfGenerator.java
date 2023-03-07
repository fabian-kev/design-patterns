package com.fabiankevin.designpatterns.behavioral.template;

public class PdfGenerator extends ReportTemplate {
    @Override
    protected void addHeader() {
        System.out.println("adding header");
    }

    @Override
    protected void addBody() {
        System.out.println("Adding body");
    }

    @Override
    protected void addFooter() {
        System.out.println("adding footer");
    }
}
