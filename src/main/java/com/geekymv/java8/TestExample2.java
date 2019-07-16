package com.geekymv.java8;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TestExample2 {

    @Test
    public void test() {
        Student s1 = new Student();
        s1.setName("张三");
        s1.addBook("Java");
        s1.addBook("Python");

        Student s2 = new Student();
        s2.setName("张三");
        s2.addBook("Java");
        s2.addBook("Python");
        s2.addBook("JavaScript");


        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);

        List<String> books = students.stream() // Stream<Student>
                .map(x -> x.getBooks()) // Stream<Set<String>>
                .flatMap(x -> x.stream()) // Stream<String>
                .distinct()
                .collect(Collectors.toList());

        books.forEach(System.out::println);
    }
}

class Student {

    private String name;

    private Set<String> books;

    public void addBook(String book) {
        if(books == null) {
            books = new HashSet<>();
        }
        books.add(book);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getBooks() {
        return books;
    }

}