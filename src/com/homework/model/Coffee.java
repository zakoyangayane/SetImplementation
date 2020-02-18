package com.homework.model;

import java.util.Objects;

/**
 * The Coffee class contains types of coffee names, the class is used in the current
 * application for testing the implemented TreeSet, where the elements are sorted by the names.
 *
 * @author Zakoyan Gayane
 * @since 2020-02-07
 */
public class Coffee implements Comparable<Coffee> {
    private String coffeeName;

    public Coffee(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    @Override
    public int compareTo(Coffee c) {
        return this.getCoffeeName().compareTo(c.getCoffeeName());
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "coffeeName='" + coffeeName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coffee coffee = (Coffee) o;
        return Objects.equals(coffeeName, coffee.coffeeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coffeeName);
    }
}
