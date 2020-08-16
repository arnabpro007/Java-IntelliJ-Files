package com.company;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Scanner scanner = new Scanner(System.in);
    double payment = scanner.nextDouble();
    scanner.close();
    NumberFormat numberFormat = new NumberFormat() {
        @Override
        public StringBuffer format(double number, StringBuffer toAppendTo, FieldPosition pos) {
            return null;
        }

        @Override
        public StringBuffer format(long number, StringBuffer toAppendTo, FieldPosition pos) {
            return null;
        }

        @Override
        public Number parse(String source, ParsePosition parsePosition) {
            return null;
        }
    };
    Currency currency_us = Currency.getInstance("USD");
    Currency currency_india = Currency.getInstance("INR");
    Currency currency_china = Currency.getInstance("CNY");
    Currency currency_france = Currency.getInstance("EUR");
        System.out.println("US: " + currency_us.getSymbol() + payment);
        System.out.println("India: " + currency_india.getSymbol() + payment);
        System.out.println("China: " + currency_china.getSymbol() + payment);
        System.out.println("France: " + payment + " " +currency_france.getSymbol());


    }
}
