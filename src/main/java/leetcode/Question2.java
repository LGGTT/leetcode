package leetcode;


import surrport.ListNode;

/**
 * 给你两个非空 的链表，表示两个非负的整数。它们每位数字都是按照逆序的方式存储的，并且每个节点只能存储一位数字。
 *
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * 你可以假设除了数字 0 之外，这两个数都不会以 0开头。
 *
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 *
 */
public class Question2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = l1.val + l2.val;  // Java int类型未赋值，默认值为 0
        int val = sum % 10;
        if (l1.next != null || l2.next != null || sum > 9) {
            l1.next = l1.next == null ? new ListNode(0) : l1.next;
            l2.next = l2.next == null ? new ListNode(0) : l2.next;
            if (sum > 9) {
                l1.next.val += 1;
            }
            return new ListNode(val, addTwoNumbers(l1.next, l2.next));
        }
        return new ListNode(val); // 最后一个节点开始返回

    }
}

