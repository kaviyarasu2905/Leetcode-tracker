// Last updated: 08/07/2026, 15:40:33
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
    public ListNode reverseList(ListNode head) {
        ListNode h2 = null;
        while(head!=null){
            ListNode temp = head;
            head = head.next;
            temp.next = h2;
            h2 = temp;
        }return h2;
    }

    public ListNode middleNode(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode m1=middleNode(head);
        ListNode h2=reverseList(m1);
        while(h2!=null){
            if(head.val != h2.val){
                return false;
            }head = head.next;
            h2 = h2.next;
        }return true;
    }
}