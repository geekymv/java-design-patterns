package com.geekymv.concurrency.effectivejava;

public interface SetObserver<E> {

    void added(ObservableSet<E> set, E element);

}
