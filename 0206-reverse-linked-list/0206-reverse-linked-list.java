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
    public ListNode reverseList(ListNode head) {
          ListNode current=head;
          ListNode prev=null;
          while(current!=null){
            ListNode next= current.next;
            current.next=prev;
            prev=current;
            current=next;

          }
          return prev;
    }
 }
//  }
//         ListNode prev = null;
//         ListNode current = head;
        
//         while (current != null) {
//             ListNode next = current.next; // Store next node
//             current.next = prev; // Reverse the link
//             prev = current; // Move prev forward
//             current = next; // Move current forward
//         }
//         return prev; // New head of reversed list
//     }
//  }