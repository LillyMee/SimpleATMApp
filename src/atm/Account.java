/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm;

/**
 *
 * @author ldhli
 */
class Account {

    private int ID = 0;
    private double balance = 0.0;
    private java.util.Date dateCreated;
    
    public Account() {
        dateCreated = new java.util.Date();
    }

    public Account(int id, double balace) {
        this();
        this.ID = id;
        this.balance = balance;
    }

    public int getID() {
        return this.ID;
    }

    public double getBalance() {
        return this.balance;
    }


    public String getDateCreated() {
        return this.dateCreated.toString();
    }

    public void setId(int id) {
        this.ID = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }
    
 
    
    
}
