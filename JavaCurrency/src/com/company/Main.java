package com.company;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Scanner scanner = new Scanner(System.in);
    double payment = scanner.nextDouble();
    scanner.close();
    NumberFormat nF = NumberFormat.getCurrencyInstance();
    nF.setCurrency(Currency.getInstance(Locale.CANADA));
    System.out.println(nF.getCurrency().getDisplayName());
    }
}
