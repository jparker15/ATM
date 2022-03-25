package com.company.ATM;

public class ATM {

    int balance;

    public ATM(){

    }

    public ATM(int balance){
        this.balance = balance;
    }


    public void displayBalance(int balance)
    {
        System.out.println("Current Balance : " + balance);
        System.out.println();
    }

    public int amountWithdrawing(int balance,
                                        int withdrawAmount)
    {
        System.out.println("Withdrawn Operation:");
        System.out.println("Withdrawing Amount : "
                + withdrawAmount);
        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println(
                    "Please collect your money and collect the card");
//            displayBalance(balance);
        }
        else {
            System.out.println("Sorry! Insufficient Funds");
            System.out.println();
        }
        return balance;
    }

    public int amountDepositing(int balance,
                                       int depositAmount)
    {
        System.out.println("Deposit Operation:");
        System.out.println("Depositing Amount : "
                + depositAmount);
        balance -= depositAmount;
        System.out.println(
                "Your Money has been successfully deposited");
//        displayBalance(balance);
        return balance;
    }

}

