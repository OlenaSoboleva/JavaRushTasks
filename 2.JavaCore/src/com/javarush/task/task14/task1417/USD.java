package com.javarush.task.task14.task1417;

/**
 * Created by osob on 9/13/2018.
 */
public class USD extends Money {
    public USD(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "USD";
    }
}
