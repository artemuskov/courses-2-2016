package com.courses.spalah.homework.multimap;

import java.util.Collection;
import java.util.Map;

/**
 * Created by Artem Uskov on 03.09.2016.
 */
public class MultiMapImplementation<K, V> implements MultiMap<K, V> {
    private int size;
    MultiMapImplementation<K, V> multiMapImplementation;

    @Override
    public boolean put(K key, V value) {
        return false;
    }

    @Override
    public Collection<V> get(K key) {
        return null;
    }

    @Override
    public Collection<V> removeAll(K key) {
        return null;
    }

    @Override
    public boolean remove(K key, V value) {
        return false;
    }

    @Override
    public Collection<V> allValues() {
        return null;
    }

    @Override
    public boolean containsValue(V value) {
        return false;
    }

    @Override
    public boolean isEmpty() {

        return false;
    }

    @Override
    public int size() {
        return size;
    }
}
