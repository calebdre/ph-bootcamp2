package com.pantherhackers.bootcamp.persistence.entities;

import java.util.List;

public class User {
    private int cardNumber;
    private int pin;
    private List<Account> accounts;

    public User(int cardNumber, int pin, List<Account> accounts) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.accounts = accounts;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public int getPin() {
        return pin;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
