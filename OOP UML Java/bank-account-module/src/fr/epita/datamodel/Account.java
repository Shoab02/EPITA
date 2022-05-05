package fr.epita.datamodel;

import java.math.BigDecimal;

public abstract class Account {
    protected double balance;

    public Account(double inititalBalance){
        this.balance = inititalBalance;
    }
}
