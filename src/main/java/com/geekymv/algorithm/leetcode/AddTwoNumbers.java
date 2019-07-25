package com.geekymv.algorithm.leetcode;

import java.io.Serializable;

/**
 * https://leetcode.com/problems/add-two-numbers/
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(0);
        ListNode rh = result;

        while (l1 != null || l2 != null) {
            int v11 = l1 != null ? l1.val : 0;
            int v21 = l2 != null ? l2.val : 0;
            int value = rh.val + v11 + v21;
            int gw = value % 10; // 个位数
            int sw = value / 10; // 十位数
            rh.val = gw;

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
            if(l1 == null && l2 == null && sw == 0) {
                break;
            }
            ListNode next = new ListNode(sw);
            rh.next = next;

            rh = rh.next;
        }

        return result;
    }

}

class ListNode implements Serializable {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
