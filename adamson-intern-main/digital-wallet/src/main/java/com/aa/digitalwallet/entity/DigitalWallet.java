package com.aa.digitalwallet.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DigitalWallet {

    private double balance;
    private int id;


    public DigitalWallet() {
    }

    public DigitalWallet(double balance, int id) {
        this.balance = balance;
        this.id = id;
    }


    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "{"
            + " id='" + getId() + "'"
            + ", balance='" + getBalance() + "'"
            + "}";
    }
     
}
