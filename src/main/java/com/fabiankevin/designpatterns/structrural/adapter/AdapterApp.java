package com.fabiankevin.designpatterns.structrural.adapter;

public class AdapterApp {
    public static void main(String[] args) {
        ExternalAccount externalAccount = new ExternalAccount();
        externalAccount.setAccount("123456789");
        externalAccount.setExpiry("15/25");
        externalAccount.setSecretCvv("432");

        AccountAdapter account = new AccountAdapter(externalAccount);

        TransactionService transactionService = new TransactionService();
        //compatible now
        transactionService.send(account);
    }
}
