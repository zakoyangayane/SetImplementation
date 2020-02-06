package com.homework.model;

/**
 * The Coffee enum contains types of coffee names, which is used in the current
 * application for testing the implemented TreeSet.
 *
 * @author Zakoyan Gayane
 * @since 2020-02-07
 */
public enum Coffee {
    ESPRESSO,
    CAPPUCCINO,
    ARABICA,
    LATTE;

    @Override
    public String toString() {
        return this.name();
    }
}
