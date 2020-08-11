package com.company;

public class Bank {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Bank(){
        this("SBIN0000",2000.0);
        System.out.println("Empty constructor called");
    }

    public Bank(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Bank(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
        System.out.println("New constructor called");
    }




    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



    public void deposit(double deposit){
        if (deposit>0){
            this.balance += deposit;
        }
        System.out.println("Your deposit has been updated!! Account Balance: "+ this.balance);
    }
    public void withdrawal(double withdrawingAmount){
        if (withdrawingAmount<= this.balance){
            this.balance -= withdrawingAmount;
            System.out.println("You have withdrawn: "+ withdrawingAmount + "  Now your balance is : " + this.balance);
        }else {
            System.out.println("Insufficient funds!");
        }
    }

}
