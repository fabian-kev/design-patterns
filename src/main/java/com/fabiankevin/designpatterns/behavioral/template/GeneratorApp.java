package com.fabiankevin.designpatterns.behavioral.template;

public class GeneratorApp {
    public static void main(String[] args) {
        ReportTemplate pdfGenerator = new PdfGenerator();

        pdfGenerator.generate();
    }
}
