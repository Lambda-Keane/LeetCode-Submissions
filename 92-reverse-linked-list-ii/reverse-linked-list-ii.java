/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null) return null;
        if (left == right) return head;
        ListNode dummyHead = new ListNode(0, head);
        ListNode prevTmp = null, prev = null, cur = dummyHead, next = null;

        for (int i = 1; i <= left; i++) {
            prevTmp = cur;
            cur = cur.next;
        }
        for (int i = left; i <= right; i++) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        prevTmp.next.next = next;
        prevTmp.next = prev;
        
        return dummyHead.next;
    }
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode prev, cur, next;
        prev = null;
        cur = head;
        
        return prev;
    }
}