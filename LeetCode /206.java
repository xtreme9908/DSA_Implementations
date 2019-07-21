/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode begin1 = head ;
        ListNode ReverseList = null ;
        while(begin1!=null){
            ListNode begin2 = begin1.next;
            begin1.next = ReverseList;
            ReverseList = begin1;
            begin1 = begin2;
        }
        return ReverseList;
    }
}