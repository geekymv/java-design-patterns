package com.geekymv.datastruct;

public class SingleLinkedList {

    private Node head;

    private int count;

    public int getCount() {
        return count;
    }

    public void add(Object item) {
        Node newNode = new Node(item, null);
        if(head == null) {
            head = new Node(null, newNode);
        }else {
            Node node = head;
            while(node.next != null) {
                node = node.next;
            }
            node.next = newNode;
        }
        count++;
    }


    public Object get(int index) {
        Node node = this.node(index);
        if(node == null) {
            return null;
        }
        return node.item;
    }

    /**
     * 获取索引对应的节点
     * @param index
     * @return
     */
    public Node node(int index) {
        if(index < 0 || index > count) {
            return null;
        }
        Node node = head;
        for(int i  = 0; i < index; i++) {
            node = node.next;
        }
        Node next = node.next;
        return next;
    }


    public void add(int index, Object item) {
        if(index < 0 || index > count) {
            return;
        }
        Node newNode = new Node(item, null);
        if(head == null) {
            head = new Node(null, newNode);
        }else {
            Node node = head;
            for(int i  = 0; i < index; i++) {
                node = node.next;
            }
            Node next = node.next;
            newNode.next = next;
            node.next = newNode;
        }
        count++;
    }

    public void list() {
        if(head == null || head.next == null) {
            return;
        }
        for(Node node = head.next; node != null; node = node.next) {
            System.out.println(node.item);
        }
    }


    class Node {

        Object item;

        Node next;

        public Node(Object item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

}
