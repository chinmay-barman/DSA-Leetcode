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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        ListNode one = l1;
        ListNode two = l2;
        int carry = 0;
        while(one!=null && two!=null){
            int sum = one.val+two.val+carry;
            ListNode newNode = new ListNode(sum%10);
            carry = sum/10;
            temp.next = newNode;
            temp = temp.next;
            one = one.next;
            two = two.next;
        }
        while(one!=null){
            int sum = one.val+carry;
            ListNode newNode = new ListNode(sum%10);
            carry = sum/10;
            temp.next = newNode;
            temp = temp.next;
            one = one.next;
        }
        while(two!=null){
            int sum = two.val+carry;
            ListNode newNode = new ListNode(sum%10);
            carry = sum/10;
            temp.next = newNode;
            temp = temp.next;
            two = two.next;
        }
        if(carry!=0){
            ListNode newNode = new ListNode(carry);
            temp.next = newNode;
        }
        return dummy.next;
    }
}