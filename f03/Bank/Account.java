package Bank;

import java.util.Scanner;

public class Account {
    protected double balance;

    /*
        Constructors
     */

    public Account() {
        this.balance = 0;
    }



    /*
        Getters and Setters
     */

    public double getBalance() {
        return balance;
    }



    /*
        Methods
     */

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount * 1.05;
    }



    public static void main(String[] args) {

    }
}
