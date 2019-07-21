/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode newnode = new ListNode(0);
        newnode.next = head;
        head = newnode;
        
        while(head.next != null){
            if(head.next.val == val){
                head.next = head.next.next;
            }
            else{
                head = head.next;
            }
        }
        return newnode.next;
    }
}