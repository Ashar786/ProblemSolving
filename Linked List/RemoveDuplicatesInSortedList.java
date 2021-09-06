* Definition for singly-linked list.
* class ListNode {
*     public int val;
*     public ListNode next;
*     ListNode(int x) { val = x; next = null; }
* }
*/
public class Solution {
   public ListNode deleteDuplicates(ListNode A) {
       ListNode curr = A ;
       //ListNode prev = null  ;
       ListNode nextNode = A.next ;
       while(nextNode!=null){
           if(curr.val !=nextNode.val){
                   curr.next = nextNode ;
                   curr = curr.next ;        
           }
           nextNode = nextNode.next;
           if(nextNode == null) curr.next = null ;
       }
       return A ; 
   }
}
