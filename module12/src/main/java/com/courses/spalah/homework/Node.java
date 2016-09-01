package com.courses.spalah.homework;

/**
 * Created by Artem Uskov on 01.09.2016.
 */
public class Node<E> {

    E item;
    Node<E> prev;
    Node<E> next;

    Node(Node<E> prev, E element, Node<E> next) {
        this.item = element;
        this.prev = prev;
        this.next = next;

    }
}
