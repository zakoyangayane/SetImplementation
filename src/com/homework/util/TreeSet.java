package com.homework.util;

/**
 * The TreeSet implementation is done using the MyLinkedList class and the Set interface.
 * Any object assigned to this class should extend the Comparable interface.
 * All objects in this type of set are kept in sorted order, where no duplicates are allowed,
 * and no null elements allowed here.
 *
 * @param <T>
 * @author Zakoyan Gayane
 * @since 2020-02-07
 */
public class TreeSet<T extends Comparable<T>> implements Set<T> {
    public MyLinkedList<T> elements;

    public TreeSet() {
        elements = new MyLinkedList<>();
    }

    /*adds the element to the set if it is not already present there and if it's not equal to null*/
    @Override
    public boolean add(T element) {
        if (getWhetherNull(element) && !this.contains(element)) {
            this.elements.add(element);
            return true;
        }
        return false;
    }

    /*removes the current element from the set if it is present there*/
    @Override
    public boolean remove(T element) {
        if (getWhetherNull(element) && this.contains(element)) {
            this.elements.remove(element);
            return true;
        }
        return false;
    }

    /*checks whether the current element is included in the set or not*/
    @Override
    public boolean contains(T element) {
        if (getWhetherNull(element) && element == null) {
            throw new NullPointerException("TreeSet doesn't contain null element");
        }
        return this.elements.contains(element);
    }

    /*gives the size of the set*/
    @Override
    public int getSize(Set<T> element) {
        if (this.elements == null) {
            throw new NullPointerException("The TreeSet is null");
        }
        return this.elements.size();
    }

    /*prints the elements of the list*/
    public void printElements() {
        this.elements.printInfo(this.elements);
    }

    public boolean getWhetherNull(T element) {
        if (getWhetherNull(element)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "TreeSet{" +
                "elements=" + elements +
                '}';
    }
}
