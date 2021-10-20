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
    public ListNode deleteDuplicates(ListNode head) {
        //sort method compair pairs of variables and delete if one if both same
        ListNode temp = head;
        while (temp != null){
            if(temp.next == null){ break;}
            if(temp.val == temp.next.val){
                temp.next = temp.next.next;
            } else { 
                temp = temp.next;
            }
        }
        return head;
    }
}