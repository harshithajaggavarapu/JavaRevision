package com.task78;

public class BankAccount {
    private long accountNo;
    private String accountHolderName;
    private double balance;

    public BankAccount(long accountNo, String accountHolderName, double balance){
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount){
        this.balance +=amount;
    }
    public void withdraw(double amount){
        if(amount> this.balance){
            System.out.println("Balance is low, unable to withdraw");
        }else{
            this.balance-=amount;
            System.out.println("successful");
        }
    }

    public static void main(String[] args) {
        BankAccount bc = new BankAccount(1234, "harshi",0);
        bc.deposit(100);
        bc.withdraw(100);
    }
}
