package com.fabiankevin.designpatterns.structrural.adapter;

public class TransactionService {
    public void send(Account account) {
        System.out.println("Sending to "+account.getAccountNumber());
    }

}
