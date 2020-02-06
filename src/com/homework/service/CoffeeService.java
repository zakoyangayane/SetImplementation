package com.homework.service;

import com.homework.model.Coffee;

public class CoffeeService {
    public Coffee coffee1;
    public Coffee coffee2;
    public Coffee coffee3;
    public Coffee coffee4;
    public Coffee coffee5;
    public Coffee coffee6;

    public CoffeeService() {
        coffee1 = new Coffee("Latte");
        coffee2 = new Coffee("Espresso");
        coffee3 = new Coffee("Cappuccino");
        coffee4 = new Coffee("Arabica");
        coffee5 = new Coffee("Latte");
        coffee6 = new Coffee("Cappuccino");
    }
}
