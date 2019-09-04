package com.geekymv.concurrency.effectivejava;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ObservableSet<E> extends ForwardingSet<E> {

    public ObservableSet(Set<E> s) {
        super(s);
    }

    private final List<SetObserver<E>> observers = new ArrayList<>();

    public void addObserver(SetObserver<E> observer) {
        synchronized (observers) {
            observers.add(observer);
        }
    }

    public boolean removeObserver(SetObserver<E> observer) {
        synchronized (observers) {
            return observers.remove(observer);
        }
    }

    private void notifyElementAdded(E element) {
        synchronized (observers) {
            for(SetObserver<E> observer : observers) {
                observer.added(this, element);
            }
        }
    }

    @Override
    public boolean add(E e) {
        boolean added = super.add(e);
        if(added) {
            System.out.println(e + " 添加成功，通知观察者");
            notifyElementAdded(e);
        }
        return added;
    }
}
