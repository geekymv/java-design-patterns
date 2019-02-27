package com.geekymv.designpatterns.state.demo;

public class Context {
    // 持有一个State对象引用
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void execute(String param) {
        state.handler(param);
    }


}
