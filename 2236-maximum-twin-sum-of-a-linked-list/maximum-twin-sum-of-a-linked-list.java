class Solution {
    public int pairSum(ListNode head) {
        int max = 0;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prevNode = null;

        while (slow != null) {
            ListNode nextNode = slow.next;
            slow.next = prevNode;
            prevNode = slow;
            slow = nextNode;
        }

        ListNode temp = head;
        ListNode temp2 = prevNode;

        while (temp2 != null) {
            max = Math.max(max, temp.val + temp2.val);
            temp = temp.next;
            temp2 = temp2.next;
        }

        return max;
    }
}