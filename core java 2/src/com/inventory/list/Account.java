package com.inventory.list;

public class Account {
    private int accountNumber;
    private String accountName;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Account(int accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
    }

    
}