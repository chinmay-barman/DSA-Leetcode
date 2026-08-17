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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode tail = head;
        while(tail.next!=null){
            tail = tail.next;
        }
        mergeSort(head,tail);
        return head;
    }
    public void mergeSort(ListNode head,ListNode tail){
        if(head==tail){
            return;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=tail && fast!=tail.next){
            slow = slow.next;
            fast = fast.next.next;
        }
        mergeSort(head,slow);
        mergeSort(slow.next,tail);
        merge(head,slow,tail);
    }
    public void merge(ListNode left,ListNode mid,ListNode right){
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode i = left;
        ListNode j = mid.next;
        while(i!=mid.next && j!=right.next){
            if(i.val<=j.val){
                arr.add(i.val);
                i = i.next;
            }
            else{
                arr.add(j.val);
                j = j.next;
            }
        }
        while(i!=mid.next){
            arr.add(i.val);
            i = i.next;
        }
        while(j!=right.next){
            arr.add(j.val);
            j = j.next;
        }
        for(int k=0;k<arr.size();k++){
            left.val = arr.get(k);
            left = left.next;
        }
    }
}