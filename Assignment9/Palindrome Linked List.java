
//   Definition for singly-linked list.
public class ListNode {
      int val;
      ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode newhead = rev(head);
        ListNode temp2 = newhead;
        ListNode temp1 = head;
        while(temp2!=null){
            if(temp1.val!=temp2.val){
                return false;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return true;
    }

    public static ListNode rev(ListNode head){
        ListNode prev = null;
        ListNode mid = middle(head);
        ListNode curr = mid.next;

        while(mid!=null){
            mid.next = prev;
            prev = mid;
            mid = curr;
            if(curr!=null){
                curr = curr.next;
            }
        }
        return prev;
    }

    public static ListNode middle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

// Input: head = [1,2]
// Output: false

// Time Complexity : O(n)
// Space Complexity : O(1)