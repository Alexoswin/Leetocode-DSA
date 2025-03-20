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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        ListNode  temp2 = head;

        int s = 0;

        while(temp != null){
            s++;
            temp = temp.next;
        }

        int x = s -n;
        if(x == 0){
            return head.next;
        }
     
        while(x != 1){
            temp2 = temp2.next;
            x--;
        }
        temp2.next = temp2.next.next;
        return head;
    }
}