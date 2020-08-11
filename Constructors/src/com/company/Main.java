package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bank bank = new Bank();//"SBIN100756",2000);
        bank.setAccountNumber("SBIN100758923");
        bank.setBalance(17000);
        bank.setCustomerName("Arnab Mukherjee");
        bank.setEmail("arnab1998tyt17@gmail.com");
        bank.setPhoneNumber("+91-7278107091");
        bank.deposit(15000);
        bank.withdrawal(10000);


        System.out.println("----VIP Customer Arena-----");
        System.out.println("Customer 1");
        VipCustomer Xendo = new VipCustomer();
        System.out.println("Customer Name: " + Xendo.getName() );
        System.out.println("Customer Credit limit: " + Xendo.getCreditLimit()) ;
        System.out.println("Customer email id: "+ Xendo.getEmail());

        System.out.println("Customer 2");
        VipCustomer Xendo1 = new VipCustomer("Tintin",250000);
        System.out.println("Customer Name: " + Xendo1.getName() );
        System.out.println("Customer Credit limit: " + Xendo1.getCreditLimit()) ;
        System.out.println("Customer email id: "+ Xendo1.getEmail());

        System.out.println("Customer 3");
        VipCustomer Xendo3 = new VipCustomer("Captain Hadock", 1000, "hadock@marlenespike.com");
        System.out.println("Customer Name: " + Xendo3.getName() );
        System.out.println("Customer Credit limit: " + Xendo3.getCreditLimit()) ;
        System.out.println("Customer email id: "+ Xendo3.getEmail());
    }
}
