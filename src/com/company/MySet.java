package com.company;

import java.io.Serializable;
import java.util.*;

public class MySet<E> extends AbstractSet<E> implements Serializable, Cloneable, Set<E> {
    private static final Object PRESENT = new Object();
    private transient HashMap<E,Object> map;

    public MySet() {
        map = new HashMap<>();
    }

    public MySet(Collection<? extends E> collection) {
        map = new HashMap<>(Math.max(16, (int)(collection.size()/.75f)+1));
        this.addAll(collection);
    }

    @Override
    public boolean add(E e) {
        return map.put(e, PRESENT) == null;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}