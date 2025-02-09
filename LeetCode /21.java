/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode NewList = new ListNode(0);
        ListNode next = NewList;
        
        while(l1!=null || l2!=null){
            if(l1 == null){
                next.next = l2;
                break;
            }
            else if(l2 == null){
                next.next = l1;
                break;
            }
            
            if(l1.val <= l2.val){
                next.next = l1;
                l1 = l1.next;
            }
            else{
                next.next = l2;
                l2 = l2.next;
            }
            next = next.next;
        }
    return NewList.next;   
    }
}