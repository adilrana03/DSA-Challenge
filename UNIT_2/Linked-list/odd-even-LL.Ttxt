// Input: head = [1,2,3,4,5];
// Output: [1,3,5,2,4];


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
        public ListNode oddEvenList(ListNode head) {
            if (head == null)
            // if there is no element //
            return null;
            // for 1, 3, 5,...
            ListNode odd = head;
            // for 2, 4, 6,...
            ListNode even = head.next;
            ListNode evenHead = head.next;
            // `even != null` rules out the list of only 1 node
            // `even.next != null` rules out the list of only 2 nodes
            while (even != null && even.next != null) {
                // Put odd to the odd list
                odd.next = odd.next.next;
                
                // Put even to the even list
                even.next = even.next.next;
                
                // Move the pointer to the next odd/even
                odd = odd.next;
                even = even.next;
            }
            odd.next = evenHead;
            return head;
        }
    }



