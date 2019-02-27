package com.geekymv.designpatterns.state.demo;

public class Client {

    public static void main(String[] args) {
        // 创建状态
        State state = new ConcreteStateA();
        // 创建环境
        Context context = new Context();
        // 将状态设置到环境中
        context.setState(state);

        // 执行请求
        context.execute("hello");

    }
}
