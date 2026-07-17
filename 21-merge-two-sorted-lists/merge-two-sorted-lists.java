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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode first = list1;
        ListNode second = list2;
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        while(first!=null && second!=null){
            ListNode newNode;
            if(first.val<second.val){
                newNode = new ListNode(first.val);
                first = first.next;
            }
            else{
                newNode = new ListNode(second.val);
                second = second.next;
            }
            temp.next = newNode;
            temp = temp.next;
        }
        while(first!=null){
            ListNode newNode = new ListNode(first.val);
            temp.next = newNode;
            temp = temp.next;
            first = first.next;
        }
        while(second!=null){
            ListNode newNode = new ListNode(second.val);
            temp.next = newNode;
            temp = temp.next;
            second = second.next;
        }
        return dummy.next;
    }
}