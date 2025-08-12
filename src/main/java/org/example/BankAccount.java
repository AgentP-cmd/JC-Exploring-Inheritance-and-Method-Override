package org.example;

public class BankAccount {
    protected double balance;

    public BankAccount(double startingBalance){
        this.balance = startingBalance;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
