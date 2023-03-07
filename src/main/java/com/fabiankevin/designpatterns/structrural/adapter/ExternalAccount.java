package com.fabiankevin.designpatterns.structrural.adapter;

public class ExternalAccount {
    private String account;
    private String secretCvv;
    private String expiry;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getSecretCvv() {
        return secretCvv;
    }

    public void setSecretCvv(String secretCvv) {
        this.secretCvv = secretCvv;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }
}
