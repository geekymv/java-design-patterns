package com.geekymv.datastruct;

public class SingleLinkedListTest {

    public static void main(String[] args) {
        SingleLinkedList linkedList = new SingleLinkedList();
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.add("4");


        SingleLinkedList.Node node = linkedList.node(0);

        System.out.println(node.item);

//        linkedList.list();
//
//        linkedList.add(4, "0");
//
//        System.out.println("----------------------------------");
//
//        linkedList.list();
//
//        System.out.println("list count = " + linkedList.getCount());
//
//        Object item = linkedList.get(1);
//        System.out.println("item = " + item);

    }

}
