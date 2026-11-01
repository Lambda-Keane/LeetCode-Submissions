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
        ListNode pLeft = null, cLeft = null, chLeft = null;
        ListNode pRight = null, cRight = null, chRight = null;
        ListNode cur = head;
        int i = 1;
        while (cur != null) {
            if (i == left - 1) {
                pLeft = cur;
            }
            if (i == left) cLeft = cur;
            if (i == right) {
                cRight = cur;
                chRight = cur.next;
                break;
            }
            i++;
            cur = cur.next;
        }
        if (pLeft != null) {
            pLeft.next = null;
            cRight.next = null;
            ListNode reversed = reverseList(cLeft);
            pLeft.next = cRight;
            cLeft.next = chRight;
        } else {
            cRight.next = null;
            ListNode reversed = reverseList(cLeft);
            cLeft.next = chRight;
            head = cRight;
        }
        
        return head;
    }
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode prev, cur, next;
        prev = null;
        cur = head;
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}