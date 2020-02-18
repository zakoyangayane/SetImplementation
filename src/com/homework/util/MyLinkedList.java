package com.homework.util;

/**
 * MyLinkedList is an implementation in this application for helping creating the TreeSet
 * type of Set. It's not the current implementation of the LinkedList.
 * Here the elements of any type are kept in sorted order. And never a duplicate
 * can be requested to be added here, cause the TreeSet from where this type of object is created,
 * doesn't call here if an element is already existing in the list here.
 * Any type of object assigned to these class should be extending Comparable interface.
 *
 * @param <T>
 * @author Zakoyan Gayane
 * @since 2020-02-07
 */
public class MyLinkedList<T extends Comparable<T>> {
    private Node<T> first;
    private Node<T> last;
    private int listSize;

    static class Node<T extends Comparable<T>> {
        public Node<T> previous;
        public T current;
        public Node<T> next;

        public Node(Node<T> previous, T current, Node<T> next) {
            this.previous = previous;
            this.current = current;
            this.next = next;
        }
    }

    /*add an element to the list, to its correct position*/
    public void add(T element) {
        Node<T> node = new Node<T>(null, element, null);
        if (listSize == 0) {
            first = last = node;
        } else {
            for (Node<T> n = this.first; n != null; n = n.next) {
                if (n.current.compareTo(element) > 0) {
                    Node<T> swap = null;
                    if (n.previous != null) {
                        swap = n.previous;
                    }
                    n.previous = node;
                    node.next = n;

                    if (swap != null) {
                        swap.next = node;
                        node.previous = swap;
                    } else {
                        first = node;
                    }
                    break;
                }
                if (n.current.compareTo(element) < 0) {
                    if (n.next == null) {
                        node.previous = n;
                        n.next = node;
                        last = node;
                        break;
                    }
                }
            }
        }
        listSize++;
    }

    /*remove an element from a list*/
    public void remove(T element) {
        for (Node<T> n = this.first; n != null; n = n.next) {
            if (n.current.equals(element)) {
                if (n.next == null) {
                    n.previous.next = null;
                } else if (n.previous == null) {
                    n.next.previous = null;
                } else {
                    n.previous.next = n.next;
                    n.next.previous = n.previous;
                }
                listSize--;
            }
        }
    }

    /*returns the number of elements in this list*/
    public int size() {
        return listSize;
    }

    /*prints the list*/
    public void printInfo(MyLinkedList<T> myList) {
        for (Node<T> n = myList.first; n != null; n = n.next) {
            System.out.println(n.current);
        }
    }

    /*checks whether the list contains the current element*/
    public boolean contains(T t) {
        for (Node<T> n = this.first; n != null; n = n.next) {
            if (n.current.equals(t)) {
                return true;
            }
        }
        return false;
    }
}
