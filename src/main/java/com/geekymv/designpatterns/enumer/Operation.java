package com.geekymv.designpatterns.enumer;

public enum Operation {
    PLUS {
        @Override
        double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS {
        @Override
        double apply(double x, double y) {
            return x - y;
        }
    },

    MULTIPLY {
        @Override
        double apply(double x, double y) {
            return x * y;
        }
    },

    DIVIDE {
        @Override
        double apply(double x, double y) {
            if(y == 0) {
                throw new ArithmeticException("除数不能为0");
            }
            return x / y;
        }
    };

    abstract double apply(double x, double y);

}
