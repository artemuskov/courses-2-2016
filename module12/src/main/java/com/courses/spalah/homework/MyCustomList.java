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

    public MyCustomList() {
    }

    public MyCustomList(Collection<? extends E> c) {
        this();
        addAll(c);
    }


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
        Node<E> newNode = new Node<E>(first, element, last);




        //linkLast(element);
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
