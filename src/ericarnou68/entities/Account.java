package ericarnou68.entities;

import ericarnou68.exceptions.AmountExceedsWithdrawLimit;
import ericarnou68.exceptions.NotEnoughBalance;

public class Account {
    private Integer accountNumber;
    private String holder;
    private Double withdrawLimit;
    private Double initialBalance;

    public Account(){

    }

    public Account(Integer accountNumber, String holder, Double withdrawLimit, Double initialBalance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.withdrawLimit = withdrawLimit;
        this.initialBalance = initialBalance;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public Double getBalance() {
        return initialBalance;
    }

    public void deposit(Double amount){
        initialBalance += amount;
    }
    public void withdraw(Double amount) throws AmountExceedsWithdrawLimit, NotEnoughBalance {
        if(amount > withdrawLimit){
            throw new AmountExceedsWithdrawLimit();
        }
        if(amount > initialBalance){
            throw new NotEnoughBalance();
        }
        else {
            initialBalance -= amount;
        }
    }

}
