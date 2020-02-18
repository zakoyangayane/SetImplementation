package com.homework.util;

/**
 * The Set interface is created for making set of any kind of objects, to implement this interface
 * in other types and Set and overriding these methods giving them their own functionality.
 *
 * @param <T>
 * @author Zakoyan Gayane
 * @since 2020-02-07
 */
public interface Set<T> {
    boolean add(T element);

    boolean remove(T element);

    boolean contains(T element);

    int getSize(Set<T> element);
}
