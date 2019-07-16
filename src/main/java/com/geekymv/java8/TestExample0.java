package com.geekymv.java8;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 从jdk.8 开始 Collection 类中新增了返回default 类型的 stream()方法
 *
 */
public class TestExample0 {

    @Test
    public void test01() {
        Collection<Widget> widgets = new ArrayList<>();
        widgets.add(new Widget(1, Color.RED));
        widgets.add(new Widget(2, Color.BLACK));

        int sum = widgets.stream()
                .filter(w -> w.getColor() == Color.YELLOW)
                .mapToInt(w -> w.getWeight())
                .sum();

        System.out.println(sum);
    }
}

class Widget {

    private int weight;

    private Color color;

    public Widget() {
    }

    public Widget(int weight, Color color) {
        this.weight = weight;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}

enum Color {
    RED, BLACK, YELLOW;
}