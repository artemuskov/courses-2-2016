package com.courses.spalah.homework;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

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
            Node<E> oldLast = last;
            last = new Node<E>(oldLast, element, first);
            oldLast.setNext(last);
            first.setPrev(last);
        }
        size++;
        return true;
    }

    @Override
    public void add(int index, E element) {
        int listSize = size;
        if(index == 0) {
            Node<E> oldFirst = first;
            first = new Node<E>(last, element, oldFirst);
            oldFirst.setPrev(first);
            last.setNext(first);
            size++;
        }
        if(index == listSize - 1) {
            Node<E> oldLast = last;
            last = new Node<E>(oldLast, element, first);
            oldLast.setNext(last);
            first.setPrev(last);
            size++;
        }
        if(index > 0 & index < listSize - 1) {
            Node<E> prevNode = null;
            Node<E> nextNode = null;
            Node<E> currentNode = first;
            for(int i = 1; i < index; i++) {
                prevNode = currentNode.getNext();
            }
            nextNode = prevNode.getNext();
            currentNode = new Node<E>(prevNode, element, nextNode);
            prevNode.setNext(currentNode);
            nextNode.setPrev(currentNode);
            size++;
        }
        else {
            System.out.println("Wrong index");
        }

    }

    @Override
    public void remove(int index) {
        int listSize = size;
        if(index == 0) {
           first = first.getNext();
           first.setPrev(last);
           last.setNext(first);
           size--;
       }
       if(index == listSize - 1) {
           last = last.getPrev();
           last.setNext(first);
           first.setPrev(last);
           size--;
       }
       if(index > 0 & index < listSize - 1) {
           Node<E> currentNode = first;
           for(int i = 1; i <= index; i++) {
               currentNode = currentNode.getNext();
           }
           Node<E> prevNode = currentNode.getPrev();
           Node<E> nextNode = currentNode.getNext();
           prevNode.setNext(nextNode);
           nextNode.setPrev(prevNode);
           size--;
       }
       if(index < 0 || index > listSize) {
           System.out.println("Wrong index");
       }

    }

    @Override
    public E get(int index) {
        Node<E> currentNode = first;
        for(int i = 0; i <= index; i++) {
            currentNode = currentNode.getNext();
        }
        return currentNode.getElement();
    }

    @Override
    public E set(int index, E element) {
        Node<E> currentNode = first;
        for(int i = 0; i <= index; i++) {
            currentNode = currentNode.getNext();
        }
        E oldElement = currentNode.getElement();
        currentNode.setElement(element);
        return oldElement;
    }

    @Override
    public boolean contains(E element) {
        boolean isContain = false;
        Node<E> currentElement = first;
        for(int i = 0; i < size; i++) {
            if(currentElement.getElement().equals(element)) {
                isContain = true;
                return isContain;
            }
            else {
                currentElement = currentElement.getNext();
            }
        }
        return isContain;
    }

    @Override
    public Iterator iterator() {
        return null;
    }


}
