class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //stored in reverse order
        //return sum as linkedlist
        // add the two  numbers
        //return new sum
        int sum = 0; 
        ListNode current = new ListNode(0);
        ListNode result = current;
        while(l1 != null || l2 != null)
        {
            if(l1 != null)
            {
                sum = sum + l1.val;
                l1 = l1.next;
            }
            if(l2 != null)
            {
                sum = sum + l2.val;
                l2 = l2.next;
            }
            current.next = new ListNode(sum % 10);
            current = current.next;
            
            sum = sum > 9 ? 1 : 0; // to carry over the 1 if it is greater than 9
        }
        
        if(sum != 0)
        {
            current.next = new ListNode(sum); //next node is at the position of the sum
        }
        return result.next;
    }
}