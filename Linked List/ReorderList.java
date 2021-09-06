/*
Reorder List
Problem Description

Given a singly linked list A

 A: A0 → A1 → … → An-1 → An 
reorder it to:

 A0 → An → A1 → An-1 → A2 → An-2 → … 
You must do this in-place without altering the nodes' values.



Problem Constraints
1 <= |A| <= 106



Input Format
The first and the only argument of input contains a pointer to the head of the linked list A.



Output Format
Return a pointer to the head of the modified linked list.



Example Input
Input 1:

 A = [1, 2, 3, 4, 5] 
Input 2:

 A = [1, 2, 3, 4] 


Example Output
Output 1:

 [1, 5, 2, 4, 3] 
Output 2:

 [1, 4, 2, 3] 


Example Explanation
Explanation 1:

 The array will be arranged to [A0, An, A1, An-1, A2].
Explanation 2:

 The array will be arranged to [A0, An, A1, An-1, A2]. */

 /**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    
    public ListNode reverseLL(ListNode node){
        ListNode prev = null ;
        ListNode curr = node ; 
        ListNode next = null;
        
        while(curr!=null){
            next = curr.next ;
            curr.next = prev ;
            prev = curr ; 
            curr = next ;
        }
        return prev ; 
    }
    
    public ListNode reorderList(ListNode A) {
        ListNode slow = A ;
        ListNode fast = slow.next ;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next ;
            fast = fast.next.next ;
        }
        ListNode node1 = A; 
        ListNode node2 = reverseLL(slow.next);
        slow.next = null;
        A = new ListNode(0);
        
        ListNode node = A ;
        while(node1!=null || node2!=null){
            if(node1!=null){
                node.next = node1 ;
                node1= node1.next ;
                node = node.next ;
            }
            if(node2!=null){
                node.next = node2 ;
                node2 = node2.next ;
                node = node.next ;
            }
        }
        return A.next ;
        
    }
}
