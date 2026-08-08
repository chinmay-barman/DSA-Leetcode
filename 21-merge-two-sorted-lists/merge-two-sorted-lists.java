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
        if(list1==null){
            return list2;
        }
        else if(list2==null){
            return list1;
        }
        ListNode one = list1;
        ListNode two = list2;
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        while(one!=null && two!=null){
            if(one.val<=two.val){
                temp.next = one;
                temp = temp.next;
                one = one.next;
            }
            else{
                temp.next = two;
                temp = temp.next;
                two = two.next;
            }
        }
        while(one!=null){
            temp.next = one;
            temp = temp.next;
            one = one.next;
        }
        while(two!=null){
            temp.next = two;
            temp = temp.next;
            two = two.next;
        }
        return dummy.next;
    }
}