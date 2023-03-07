package com.fabiankevin.designpatterns.structrural.adapter;

public class AccountAdapter implements Account {
    private final ExternalAccount accountDtoResponse;

    public AccountAdapter(ExternalAccount accountDtoResponse) {
        this.accountDtoResponse = accountDtoResponse;
    }

    @Override
    public String getAccountNumber() {
        return accountDtoResponse.getAccount();
    }

    @Override
    public String getCvv() {
        return accountDtoResponse.getSecretCvv();
    }

    @Override
    public String getExpiry() {
        return accountDtoResponse.getExpiry();
    }
}
