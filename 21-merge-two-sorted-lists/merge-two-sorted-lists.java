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
        ListNode p1 = list1;
        ListNode p2 = list2;
        ListNode ans = new ListNode(0);
        ListNode pointer = ans;
        while(p1!=null && p2!=null){
            if(p1.val<p2.val){
                ListNode newNode = new ListNode(p1.val);
                pointer.next = newNode;
                pointer = newNode;
                p1 = p1.next;
            }
            else{
                ListNode newNode = new ListNode(p2.val);
                pointer.next = newNode;
                pointer = newNode;
                p2 = p2.next;
            }
        }
        while(p1!=null){
            ListNode newNode = new ListNode(p1.val);
            pointer.next = newNode;
            pointer = newNode;
            p1 = p1.next;
        }
        while(p2!=null){
            ListNode newNode = new ListNode(p2.val);
            pointer.next = newNode;
            pointer = newNode;
            p2 = p2.next;
        }
        return ans.next;
    }
}