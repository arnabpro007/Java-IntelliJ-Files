package com.company;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
        System.out.println("Constructor 3 called!");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name,creditLimit,"default@vip");
        System.out.println("Constructor 2 called!");
    }

    public VipCustomer() {
        this("default",0000);
        System.out.println("Constructor 1 called!");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
