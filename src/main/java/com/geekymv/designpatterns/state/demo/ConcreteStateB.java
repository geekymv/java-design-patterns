package com.geekymv.designpatterns.state.demo;

public class ConcreteStateB implements State {

    @Override
    public void handler(String param) {
        System.out.println("ConcreteStateB handler = " + param);
    }
}
