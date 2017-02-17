package com.pantherhackers.bootcamp.persistence.entities;

public class Account {

    private int id;
    private String name;
    private int amount;
    private boolean textAlertsActivated;

    public Account(int id, String name, int amount, boolean textAlertsActivated) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.textAlertsActivated = textAlertsActivated;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public boolean isTextAlertsActivated() {
        return textAlertsActivated;
    }
}
