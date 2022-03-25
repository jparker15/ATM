package com.company;

import com.company.ATM.ATM;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int balance = 10000;
        int withdrawAmount = 5000;
        int depositAmount = 2000;

        ATM atm = new ATM(balance);

        // calling display balance
        atm.displayBalance(balance);
        // withdrawing amount
        balance = atm.amountWithdrawing(balance, withdrawAmount);
        // depositing amount
        balance = atm.amountDepositing(balance, depositAmount);
    }
}
