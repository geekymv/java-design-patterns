package com.geekymv.designpatterns.state.demo;

public class ConcreteStateA implements State {

    @Override
    public void handler(String param) {
        System.out.println("ConcreteStateA handler = " + param);
    }
}
