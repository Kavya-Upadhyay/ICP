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
        ListNode temp = head;
        if(head == null || head.next == null){
            return head;
        }
        while(temp!=null && temp.next!=null){
            if(temp.val == temp.next.val){
                temp.next = temp.next.next;
            }
            else{
                temp = tempww.next;
            }
            
        }
        return head;
        
    }
}


// Input: head = [1,1,2]
// Output: [1,2]


// Time Complexity:O(n)
// Space Complexity : O(1)