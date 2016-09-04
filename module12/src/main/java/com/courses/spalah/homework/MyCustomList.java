package com.courses.spalah.homework;

import java.util.Collection;
import java.util.Iterator;

import static java.util.Collections.addAll;

/**
 * Created by Artem Uskov on 22.08.2016.
 */
public class MyCustomList<E> implements MyList<E>{

    private Node<E> first;
    private Node<E> last;
    private int size;


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if(size == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean add(E element) {
        if(first == null) {
            first = new Node<E>(last, element, null);
            last = first;
        }
        else {
            Node<E> l = last;
            Node<E> newNode = new Node<E>(l, element, first);
            last = newNode;
            l.setNext(newNode);
        }
        size++;
        return true;
    }

    @Override
    public void add(int index, E element) {
        if(index >= 0 & index < size) {
      //      linkBefore(element, );
        }

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public boolean contains(E element) {
        Node<E> currentElement = first;
        for(int i = 0; i < size; i++) {
            if (currentElement.equal(element)) {
                return true;
            }
            currentElement = currentElement.getNext();
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    void linkLast(E element) {
        final Node<E> l = last;
        final Node<E> newNode = new Node<E>(l, element, null);
        last = newNode;
        if(l == null) {
            first = newNode;
        }
        else {
            l.next = newNode;
        }
        size++;
    }

    void linkBefore(E element, Node<E> succ) {
        final Node<E> pred = succ.prev;
        final Node<E> newNode = new Node<E>(pred, element, succ);
        succ.prev = newNode;
        if(pred == null) {
            first = newNode;
        }
        else {
            pred.next = newNode;
        }
        size++;
    }
}
