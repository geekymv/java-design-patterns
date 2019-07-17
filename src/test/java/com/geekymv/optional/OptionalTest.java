package com.geekymv.optional;

import org.junit.Test;

import java.util.Optional;

/**
 * Optional 无法序列化
 */
public class OptionalTest {

    /**
     * 可以用ofNullable 方法将一个可能为null的对象封装成Optional对象
     * 获取值的时候用orElse 方法提供默认值
     */
    @Test
    public void test01() {
        Car cat = null;
        // 将指定指用Optional封装之后返回，如果该值为null，则返回空的Optional对象。
        Optional<Car> op = Optional.ofNullable(cat);
        // 使用map 方法获取封装对象的字段值
        Optional<String> opName = op.map(Car::getName);
        // 如果有值则返回，否则返回指定的默认值
        String name = opName.orElse("");

        System.out.println("name = " + name);
    }


    @Test
    public void test02() {
        Person person = new Person();
        Car car = new Car();
        car.setName("BM");
        person.setCar(car);

        Insurance insurance =  new Insurance();
        insurance.setName("Insurance01");
        car.setInsurance(insurance);

        Optional<Person> op = Optional.ofNullable(person);
        // flatMap 与 map类似， 区别是flatMap的mapper 需要是一个Optional 对象
        String insuranceName = op.flatMap(Person::getCarAsOptional)
                                .map(Car::getInsurance)
                                .map(Insurance::getName)
                                .orElse("Unknown");

        System.out.println("insuranceName = " + insuranceName);
    }

}


class Person {

    private Car car;

    public Optional<Car> getCarAsOptional() {
        return Optional.ofNullable(car);
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}

class Car {

    private String name;

    private Insurance insurance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }
}

class Insurance {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
