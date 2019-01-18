package com.gl.leetcode;


public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(1);
        ListNode listNode3 = new ListNode(2);
        ListNode listNode4 = new ListNode(2);
        ListNode listNode5 = new ListNode(3);
        ListNode listNode6 = new ListNode(3);
        ListNode listNode7 = new ListNode(3);
        ListNode listNode8 = new ListNode(5);
        listNode.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        listNode6.next = listNode7;
        listNode7.next = listNode8;
        listNode8.next = null;
//        while (listNode != null) {
//            System.out.print(listNode.val + " + ");
//            listNode = listNode.next;
//        }
      ListNode single =  new Solution().deleteDuplicates(listNode);
        while (single != null) {
            System.out.print(single.val + " + ");
            single = single.next;
        }
    }
}

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == current.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
