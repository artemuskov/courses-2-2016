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
        return false;
    }

    @Override
    public void add(int index, E element) {

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
}
