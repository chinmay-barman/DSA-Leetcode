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
    public ListNode insertionSortList(ListNode head) {
        ListNode slow = head;
        while(slow.next!=null){
            ListNode fast = slow.next;
            ListNode minNode = fast;
            while(fast!=null){
                if(fast.val<minNode.val){
                    minNode = fast;
                }
                fast = fast.next;
            }
            if(slow.val>minNode.val){
                int temp = slow.val;
                slow.val = minNode.val;
                minNode.val = temp;
            }
            slow = slow.next;
        }
        return head;
    }
}