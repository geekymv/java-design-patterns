package com.geekymv.algorithm.leetcode;

import org.junit.Test;

public class AddTwoNumbersTest {

    @Test
    public void test() {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;

        ListNode l4 = new ListNode(5);
        ListNode l5 = new ListNode(6);
        ListNode l6 = new ListNode(4);
        l4.next = l5;
        l5.next = l6;

        ListNode result = addTwoNumbers.addTwoNumbers(l1, l4);;
        System.out.println(result.val);
        while ((result = result.next) != null) {
            System.out.println(result.val);
        }

    }

}
