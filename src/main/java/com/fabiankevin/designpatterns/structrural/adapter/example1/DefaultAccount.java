package com.fabiankevin.designpatterns.structrural.adapter.example1;

public class DefaultAccount implements Account {
    @Override
    public String getAccountNumber() {
        return null;
    }

    @Override
    public String getCvv() {
        return null;
    }

    @Override
    public String getExpiry() {
        return null;
    }
}
