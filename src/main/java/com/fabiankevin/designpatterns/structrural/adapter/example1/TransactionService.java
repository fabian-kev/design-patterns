package com.fabiankevin.designpatterns.structrural.adapter.example1;

public class TransactionService {
    public void send(Account account) {
        System.out.println("Sending to "+account.getAccountNumber());
    }

}
